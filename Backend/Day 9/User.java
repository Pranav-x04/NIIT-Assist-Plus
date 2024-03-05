package com.birthdayevent.niranjanee.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false, unique=true)
    private String email;
    
    @Column(nullable = false)
    private String  password;

    @Column(nullable = false)
    private String user_mobile;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

}
