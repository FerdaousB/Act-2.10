package dao;

import java.util.List;

import entities.Role;
import entities.User;

public interface UtilisateurDAO {
	
	public List<User> getAllUsers();
	public boolean Register(User user);
	public boolean ConnecteUser(User user);
	public void UpdateUser(User user);
	public List<Role> getAllRoles();
	 
}
