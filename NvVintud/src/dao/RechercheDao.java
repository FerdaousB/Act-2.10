package dao;

import java.util.List;

import entities.Recherche;


public interface RechercheDao {
	
	public List<Recherche> getAllRecherche();
	public void createRecherche(Recherche recherche);
	public void UpdateRecherche(Recherche recherche);
	public boolean DeleteRecherche(Recherche recherche);
	
	
	
}
