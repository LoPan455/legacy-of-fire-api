package io.tjohander.legacyoffireapi.repository;

import io.tjohander.legacyoffireapi.model.db.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<Session, String> {

}
