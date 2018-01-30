package com.poe.trajetfacile.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String login;

    @NotBlank
    private String password;

    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private String rating;
    private Boolean confirmed;
}
