package com.aula115.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula115.project.models.ERole;
import com.aula115.project.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

    Optional<Role> findByName(ERole name);
    
}
