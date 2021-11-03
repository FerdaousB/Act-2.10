package daoFactory;

import java.sql.Connection;
import java.sql.SQLException;

import dao.AnnonceDAO;
import dao.AnnonceDAOImpl;
import dao.FavorisDao;
import dao.FavorisDaoImpl;
import dao.RechercheDao;
import dao.RechercheDaoImpl;
import dao.UtilisateurDAO;
import dao.UtilisateurDAOImpl;
import util.ConnectionUtil;

public class Factory {
	
	
	public static AnnonceDAO getAnnoucementDAO(){
        return new AnnonceDAOImpl();
    }
		
	public static FavorisDao getFavorisDAO(){
        return new FavorisDaoImpl();
    }	
	public static RechercheDao getRechercheDAO(){
        return new RechercheDaoImpl();
    }	
	
	public static UtilisateurDAO getUserDAO(){
        return new UtilisateurDAOImpl();
    }
	
  
	public static Connection connect () throws SQLException {
		return ConnectionUtil.getInstance().getConnection() ;
	}


}
