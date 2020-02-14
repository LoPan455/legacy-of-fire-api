package io.tjohander.legacyoffireapi.controller;

import io.tjohander.legacyoffireapi.model.db.Session;
import io.tjohander.legacyoffireapi.service.SessionService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class SessionController {

  @Autowired
  SessionService sessionService;

  private Session dummySession = new Session(Instant.now(), "It was totally sweet");

  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public ArrayList<Session> getSessions() {
    ArrayList<Session> sessions = new ArrayList<>();
    sessions.add(dummySession);
    return sessions;
  }

  @GetMapping("/{id}")
  public Session getSession(String id) {
    return this.dummySession;
  }

  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public String createSession(@RequestBody Session session) {
    return "Created";
  }

  @PutMapping("/{id}")
  public Session updateSession(
      @PathVariable String sessionId,
      @RequestBody Session session) {
    this.dummySession = session;
    return this.dummySession;
  }

  @DeleteMapping("{/id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteSession(@PathVariable String id) {

  }

}
