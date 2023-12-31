package com.FoodRouletteBE.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodRouletteBE.enumerated.ERole;
import com.FoodRouletteBE.models.User;
import com.FoodRouletteBE.security.payload.UtenteDTO;
import com.FoodRouletteBE.security.repository.RoleDAO;
import com.FoodRouletteBE.security.repository.UtenteDAO;

import jakarta.persistence.EntityExistsException;

@Service
public class UtenteService {
    @Autowired UtenteDAO utenteDAO;
    @Autowired
    RoleDAO roleRepository;
  
    
    
    public User updateUtente(Long user_id,UtenteDTO user) {
       
    	if(!utenteDAO.existsById(user_id)) {
    		throw new EntityExistsException("user non found!");
    	}
    	User u = utenteDAO.findById(user_id).get();
        u.setCognome(user.getCognome());
        u.setEmail(user.getEmail());
        u.setNome(user.getNome());
      return  utenteDAO.saveAndFlush(u);
       
    }
    public void addRole(Long user_Id) {
    	if(!utenteDAO.existsById(user_Id)) {
    		throw new EntityExistsException("user non found!");
    	}
    	User u = utenteDAO.findById(user_Id).get();
    	u.getRoles().add(roleRepository.findByRoleName(ERole.ROLE_ADMIN).get());
    	utenteDAO.save(u);
    }

    
    public Optional<User> findUserById(Long id) {
    	if(!utenteDAO.existsById(id)) {
    		throw new EntityExistsException("user non found!");
    	}
    	
    	return utenteDAO.findById(id);
    }
    
    public User findByUsername(String username) {
    	if(!utenteDAO.existsByUserName(username)) {
    		throw new EntityExistsException("nessun username trovato");
    	}
    return	utenteDAO.findByUserName(username).get();
    }
}

