package com.ilci.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
	private Integer id;
	private String libelle;
	private double prix;
	private String description;
	private String image;
	private int qunatite;
}
