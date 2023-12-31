package com.FoodRouletteBE.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> roles = new HashSet<>();
	// @JoinTable(name = "prenotazioni_lista_utenti", joinColumns = @JoinColumn(name
	// = "utente_id"), inverseJoinColumns = @JoinColumn(name = "prenotazione_id"))
	// @JsonIgnore
	// private List<?> listaPrenotazioni = new ArrayList(null)<?>();

	// public Utente(String userName, String nome, String cognome, String email) {
	// super();
	// this.userName = userName;
	// this.nome = nome;
	// this.pass
	// this.cognome = cognome;
	// this.email = email;
	//
	// }

}
