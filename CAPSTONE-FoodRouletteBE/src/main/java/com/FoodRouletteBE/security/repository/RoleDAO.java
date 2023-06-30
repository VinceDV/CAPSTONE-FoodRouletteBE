package com.FoodRouletteBE.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodRouletteBE.enumerated.ERole;
import com.FoodRouletteBE.models.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {

	Optional<Role> findByRoleName(ERole roleName);
}
