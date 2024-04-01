package com.kakfka.consumer;

import Entity.EventMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import repository.WikimediaDataRepo;

@Service
public class KafkaDatabseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabseConsumer.class);

    private WikimediaDataRepo wikimediaDataRepo;

    public KafkaDatabseConsumer(WikimediaDataRepo wikimediaDataRepo) {
        this.wikimediaDataRepo = wikimediaDataRepo;
    }

    @KafkaListener(topics = "wikimedia-recent-change", groupId = "myGroup")
    public void consume(String Message) {
        LOGGER.info(String.format("Message received -> %s", Message));

        EventMessage eventMessage = new EventMessage();
        eventMessage.setWikiEventData(Message);

        wikimediaDataRepo.save(eventMessage);
    }

}
