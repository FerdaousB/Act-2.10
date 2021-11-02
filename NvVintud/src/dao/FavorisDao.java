package dao;

import java.util.List;

import entities.Announcement;
import entities.Favoris;
import entities.User;

public interface FavorisDao {
  
	public List<Favoris> getAllFavoris();
	public void createFavoris(Favoris favoris);
	public void UpdateFavoris(Favoris favoris);
	public boolean DeleteFavoris(Favoris favoris);

}
	
