package tn.esprit.spring.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import tn.esprit.spring.entities.Departement;

/*Ghassen Belhouchet*/

public class EntrepriseDTO{
	

	int id;
	
	 String name;
	
	
	 String raisonSocial;
	
	@OneToMany(mappedBy="entreprise", 
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER)
	private List<Departement> departements = new ArrayList<>();

	

	

}
