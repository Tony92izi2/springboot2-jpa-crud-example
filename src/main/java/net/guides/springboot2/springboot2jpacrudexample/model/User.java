package net.guides.springboot2.springboot2jpacrudexample.model;

import java.sql.Timestamp;
import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "password")
@NoArgsConstructor
public class User {

  private int id;

  private String username;

  private String password;

  private String email;

  private boolean enable;

  private String firstName;

  private String lastName;

  private String phone;

  private Date birthday;

  private String address;

  private String postalCode;

  private String city;

  private Timestamp recordCreated;

}
