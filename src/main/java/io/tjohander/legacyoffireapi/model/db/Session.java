package io.tjohander.legacyoffireapi.model.db;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Session {

  @Id
  String id;
  Instant sessionDate;
  String recap;

  public Session(String id, Instant sessionDate, String recap) {
    this.id = id;
    this.sessionDate = sessionDate;
    this.recap = recap;
  }
}
