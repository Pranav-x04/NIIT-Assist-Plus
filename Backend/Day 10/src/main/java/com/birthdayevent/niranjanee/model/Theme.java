package com.birthdayevent.niranjanee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theme")
public class Theme {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theme_id;
    private String theme_name;
    private String theme_desc;
    private int theme_price;

}
