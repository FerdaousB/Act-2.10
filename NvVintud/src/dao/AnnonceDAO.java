package dao;

import java.util.List;

import entities.Announcement;

public interface AnnonceDAO {
	
	 public List<Announcement> afficherlisteAnnouncements();
	 public List<Announcement> rechercheAnnonceByNomCategoryPrice(String p, int b);
	 public Announcement filtreAnnonceByPrice(String p);
	 public Announcement filtreAnnonceByLocation(String l);
     public void InsertAnnonce(Announcement annonce);
     public Announcement AfficheNombtrView(int nb_V);
	 public void UpdateAnnonce(Announcement annonce);
	 public void DeleteAnnonce(Announcement annonce);

}
