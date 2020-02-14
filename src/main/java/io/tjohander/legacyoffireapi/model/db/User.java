package io.tjohander.legacyoffireapi.model.db;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class User {

  @Id
  String id;

}
