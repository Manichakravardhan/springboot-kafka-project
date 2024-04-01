Project to setup kafka event-driven system using spring-boot.

Required
1) kafka zoo keeper
2) kafka broker (https://kafka.apache.org/documentation/#quickstart)

Use the commands to start zoo keeper service and use the kafka consumer, producer.

About Project 

To consume events or stream generated from a web service which is (https://stream.wikimedia.org/v2/stream/recentchange)
wikimedia streaming platform. This stream produces the data into kafka by registering a event change handler to the source.
The stored data is consumed and populated into mysql database.

