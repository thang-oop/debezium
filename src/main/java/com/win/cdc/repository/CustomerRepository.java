package com.win.cdc.repository;

import com.win.cdc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}