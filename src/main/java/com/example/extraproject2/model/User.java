package com.example.extraproject2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String account_name;

    @Column
    private String voivodeship;

    @Column
    private String city;

    @Column
    private String address;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
