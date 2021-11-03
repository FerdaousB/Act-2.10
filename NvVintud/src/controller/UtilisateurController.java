package controller;

import java.util.ArrayList;
import java.util.List;

import dao.UtilisateurDAO;
import dao.UtilisateurDAOImpl;
import daoFactory.Factory;
import entities.User;

public class UtilisateurController {
	

	
	List<User> Utilisateurs = new ArrayList<User>();		
    User U = new User();
    
    UtilisateurDAO U1 = Factory.getUserDAO();
    
 
	
	public UtilisateurController(){
		
	}
	
		
	public List<User> getAllUsers(){
				
		return  U1.getAllUsers();
		
	}
	
	
	
	
}
