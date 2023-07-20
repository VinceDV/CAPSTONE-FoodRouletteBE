package com.FoodRouletteBE.models;

import com.FoodRouletteBE.enumerated.Difficolta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ricette")

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ricetta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMeal;
	@Column(unique = true, nullable = false)
	private String strMeal;
	@Column
	private String strMealThumb;
	@Column(nullable = false)
	private String strArea;
	// @Column(nullable = false)
	// private List<String> ingredienti;
	@Column
	private String strYoutube;
	@Column(nullable = false)
	private String strIngredient1;
	@Column(nullable = false)
	private String strIngredient2;
	@Column(nullable = false)
	private String strIngredient3;
	@Column(nullable = false)
	private String strIngredient4;
	@Column(nullable = false)
	private String strIngredient5;
	@Column(nullable = false)
	private String strIngredient6;
	@Column(nullable = false)
	private String strIngredient7;
	@Column(nullable = false)
	private String strIngredient8;
	@Column(nullable = false)
	private String strIngredient9;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Difficolta difficulty;
	@Column(nullable = false)
	private int tempoPreparazione;
	@Column(nullable = false, columnDefinition = "TEXT")
	private String strInstructions;
}
