package io.tjohander.legacyoffireapi.model.db;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Session {

  Instant sessionDate;
  String recap;

  public Session(Instant sessionDate, String recap) {
    this.sessionDate = sessionDate;
    this.recap = recap;
  }
}
