package com.FoodRouletteBE.security.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RicettaDTO {
	private long idMeal;
	private String strMeal;
	private String strMealThumb;
	private String strArea;
	private String strYoutube;
	private String strIngredient1;
	private String strIngredient2;
	private String strIngredient3;
	private String strIngredient4;
	private String strIngredient5;
	private String strIngredient6;
	private String strIngredient7;
	private String strIngredient8;
	private String strIngredient9;
	private String difficulty;
	private int tempoPreparazione;
	private String strInstructions;
}
