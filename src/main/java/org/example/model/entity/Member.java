package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

}
