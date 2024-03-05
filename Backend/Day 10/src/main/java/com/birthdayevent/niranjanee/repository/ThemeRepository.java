package com.birthdayevent.niranjanee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdayevent.niranjanee.model.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme,Integer> {

}
