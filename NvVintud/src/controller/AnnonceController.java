package controller;

import java.util.List;

import dao.AnnonceDAO;
import dao.UtilisateurDAO;
import daoFactory.Factory;
import entities.Announcement;
import entities.User;

public class AnnonceController {
	
	AnnonceDAO U2 = Factory.getAnnoucementDAO();
	
	
	private AnnonceController(){
		
	}
	
		
	public List<Announcement> findAnnouncementsById(){
				
		return  U2.findAnnouncementsById();
		
	}
	
	 public List<Announcement> findAnnonceByNomCategoryPrice(String p, int b)
	 {
		return U2.findAnnonceByNomCategoryPrice(p, b);
		 
	 }
	
	 public Announcement findAnnonceByPrice(String p)
	 {
		return U2.findAnnonceByPrice(p);
		 
	 }
	    
	 public Announcement findAnnonceByLocation(String l)
	 {
		return null;
		 
	 }
	 
     public Announcement findByNombtrView(int nb_V) {
		return null;
    	 
     }

}
