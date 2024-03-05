package com.birthdayevent.niranjanee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.niranjanee.model.Token;

public interface TokenRepository extends JpaRepository<Token,String> {

}
