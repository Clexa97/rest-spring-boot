package com.rest.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@AllArgsConstructor @NoArgsConstructor @Getter @Setter @EqualsAndHashCode @Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_Name", nullable = false, length = 80)
    private String firstName;
    @Column(name = "last_Name",nullable = false, length = 80)
    private String lastName;
    @Column(nullable = false, length = 100)
    private String address;
    @Column(nullable = false, length = 7)
    private String gender;
}
