package repository;

import Entity.EventMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WikimediaDataRepo extends JpaRepository<EventMessage, Long> {
}
