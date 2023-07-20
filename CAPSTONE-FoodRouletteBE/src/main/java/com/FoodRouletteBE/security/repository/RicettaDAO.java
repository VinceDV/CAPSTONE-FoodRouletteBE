package com.FoodRouletteBE.security.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodRouletteBE.models.Ricetta;

public interface RicettaDAO extends JpaRepository<Ricetta, Long>{
    
}
