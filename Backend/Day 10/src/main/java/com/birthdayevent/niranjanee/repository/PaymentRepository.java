package com.birthdayevent.niranjanee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdayevent.niranjanee.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
