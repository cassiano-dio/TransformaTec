package com.project.spring.security.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.security.login.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
