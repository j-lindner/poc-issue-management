package org.example.camunda.process.solution.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Entity;

@Entity(name = "my_user")
public class User extends BaseEntity {

  private String username;

  @JsonProperty(access = Access.WRITE_ONLY)
  private String password;

  public User() {}

  public User(String username, String password) {
    super();
    this.username = username;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
