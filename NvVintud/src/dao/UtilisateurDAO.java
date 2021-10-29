package dao;

import java.util.List;

import entities.User;

public interface UtilisateurDAO {
	
	 List<User> getAllUsers();
     void InserUser(User U);
	 void UpdateUser(User U);
	 void deleteUser(User U);
	 
}
