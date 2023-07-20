package com.FoodRouletteBE.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FoodRouletteBE.security.payload.RicettaDTO;
import com.FoodRouletteBE.security.service.RicettaService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/app")

public class RicettaController {

    @Autowired RicettaService ricettaService;

   @GetMapping("/ricetta")
   public ResponseEntity<?> getAllRicette(){
       return ResponseEntity.ok(ricettaService.getAllRicette());
   }
   @GetMapping("/ricetta/{id}")
   public ResponseEntity<?> getRicettaById(@PathVariable long id){
       return ResponseEntity.ok(ricettaService.getRicettaById(id));
   }
   @PostMapping("/ricetta")
    public ResponseEntity<?> inserisciRicetta(@RequestBody RicettaDTO r){
        return ResponseEntity.ok(ricettaService.inserisciRicetta(r));
    }
    @PutMapping("/ricetta/{id}")
    public ResponseEntity<?> modificaRicetta(@RequestBody RicettaDTO r){
        return ResponseEntity.ok(ricettaService.modificaRicetta(r.getIdMeal(), r));
    }
    @DeleteMapping("/ricetta/{id}")
    public ResponseEntity<?> eliminaRicetta(@PathVariable long id){
        return ResponseEntity.ok(ricettaService.eliminaRicetta(id));
    }
}
