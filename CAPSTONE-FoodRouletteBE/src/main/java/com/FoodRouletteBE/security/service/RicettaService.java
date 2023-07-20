package com.FoodRouletteBE.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodRouletteBE.enumerated.Difficolta;
import com.FoodRouletteBE.models.Ricetta;
import com.FoodRouletteBE.security.payload.RicettaDTO;
import com.FoodRouletteBE.security.repository.RicettaDAO;

@Service
public class RicettaService {

    @Autowired
    RicettaDAO ricettaDAO;

    public List<Ricetta> getAllRicette() {
        return ricettaDAO.findAll();
    }

    public Ricetta getRicettaById(long id) {
        return ricettaDAO.findById(id).get();
    }

    public Ricetta inserisciRicetta(RicettaDTO ricetta) {

        Ricetta r = new Ricetta();
        r.setStrMeal(ricetta.getStrMeal());
        r.setStrMealThumb(ricetta.getStrMealThumb());
        r.setStrArea(ricetta.getStrArea());
        r.setStrInstructions(ricetta.getStrInstructions());
        r.setStrYoutube(ricetta.getStrYoutube());
        r.setStrIngredient1(ricetta.getStrIngredient1());
        r.setStrIngredient2(ricetta.getStrIngredient2());
        r.setStrIngredient3(ricetta.getStrIngredient3());
        r.setStrIngredient4(ricetta.getStrIngredient4());
        r.setStrIngredient5(ricetta.getStrIngredient5());
        r.setStrIngredient6(ricetta.getStrIngredient6());
        r.setStrIngredient7(ricetta.getStrIngredient7());
        r.setStrIngredient8(ricetta.getStrIngredient8());
        r.setStrIngredient9(ricetta.getStrIngredient9());

        r.setDifficulty(
                ricetta.getDifficulty().equals("EASY") ? Difficolta.EASY
                        : ricetta.getDifficulty().equals("MEDIUM") ? Difficolta.MEDIUM : Difficolta.HARD);
        r.setTempoPreparazione(ricetta.getTempoPreparazione());
        return ricettaDAO.save(r);
    }

    public Ricetta modificaRicetta(long id, RicettaDTO ricetta) {
        Ricetta r = ricettaDAO.findById(id).get();
        r.setStrMeal(ricetta.getStrMeal());
        r.setStrMealThumb(ricetta.getStrMealThumb());
        r.setStrArea(ricetta.getStrArea());
        r.setStrInstructions(ricetta.getStrInstructions());
        r.setStrYoutube(ricetta.getStrYoutube());
        r.setStrIngredient1(ricetta.getStrIngredient1());
        r.setStrIngredient2(ricetta.getStrIngredient2());
        r.setStrIngredient3(ricetta.getStrIngredient3());
        r.setStrIngredient4(ricetta.getStrIngredient4());
        r.setStrIngredient5(ricetta.getStrIngredient5());
        r.setStrIngredient6(ricetta.getStrIngredient6());
        r.setStrIngredient7(ricetta.getStrIngredient7());
        r.setStrIngredient8(ricetta.getStrIngredient8());
        r.setStrIngredient9(ricetta.getStrIngredient9());

        r.setDifficulty(
                ricetta.getDifficulty().equals("EASY") ? Difficolta.EASY
                        : ricetta.getDifficulty().equals("MEDIUM") ? Difficolta.MEDIUM : Difficolta.HARD);
        r.setTempoPreparazione(ricetta.getTempoPreparazione());
        return ricettaDAO.save(r);
    }

    public Ricetta eliminaRicetta(long id) {
        ricettaDAO.deleteById(id);
        return null;
    }
}
