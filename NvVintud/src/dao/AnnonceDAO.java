package dao;

import java.util.List;

import entities.Announcement;

public interface AnnonceDAO {
	
	 List<Announcement> getAllAnnouncement();
     void InserUser(Announcement A);
	 void UpdateUser(Announcement A);
	 void deleteUser(Announcement A);

}
