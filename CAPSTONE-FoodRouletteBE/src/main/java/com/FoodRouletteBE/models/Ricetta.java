package com.FoodRouletteBE.models;

import java.util.List;

import com.FoodRouletteBE.enumerated.Difficolta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	private long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private List<String> ingredienti;
	@Column(nullable = false)
	private Difficolta difficolta;
	@Column(nullable = false)
	private double tempoPreparazione;
	@Column(nullable = false)
	private String preparazione;
}
