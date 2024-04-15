package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@Validated
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @Size(max = 50)
    String first_name;
    @Size(max = 50)
    String middle_name;
    @NotNull
    @Size(max = 100)
    String last_name;
    @NotNull

    LocalDate birth_date;
    @Email
    @NotNull
    @Size(max = 255)
    String Email;

    @NotNull
    String username;

    @NotNull
    String password;

    @Size(max =17)
    String last_login_ip;
    @NotNull
    LocalDateTime create_date;

    LocalDateTime update_time;

    boolean isActive;

    SubscriptionCL subs;
}
