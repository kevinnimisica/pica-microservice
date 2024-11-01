package com.pica.microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pica.microservice.model.ERole;
import com.pica.microservice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
