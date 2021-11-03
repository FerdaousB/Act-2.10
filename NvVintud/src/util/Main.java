package util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.AnnonceDAOImpl;
import dao.FavorisDaoImpl;
import dao.RechercheDaoImpl;
import dao.UtilisateurDAOImpl;
import entities.Announcement;
import entities.Favoris;
import entities.Recherche;
import entities.User;

  public class Main {

	    public static void main(String[] args) throws SQLException  {
		
	  //  --------------- Affichage de annonce------------- //
		
		AnnonceDAOImpl U1 = new AnnonceDAOImpl();
		Announcement A = new Announcement();

		List<Announcement> list = U1.findAnnouncementsById();
		U1.findAnnouncementsById();
		    for (Announcement A1: list ) {
		       System.out.println(A1);}

	    /* A.setId(3);
	    A.setCategory_id(1);
		A.setDescription( "taille M.");
		A.setIs_available(false);
		A.setPicture(null);
		A.setPrice(1.24);
		A.setTitle("t-shirt bon état");
		A.setUser_id(1);
		A.setLocalisation(null);
		A.setPublication_date("2019-25-11");
	    A.setView_number(2);
	    U1.InsertAnnonce(A); */
	    
	    /*A.setId(1);
	    A.setCategory_id(1);
		A.setDescription( "taille M.");
		A.setIs_available(false);
		A.setPicture(null);
		A.setPrice(1.24);
		A.setTitle("t-shirt bon état");
		A.setUser_id(1);
		A.setLocalisation(null);
		A.setPublication_date("2019-25-11");
	    A.setView_number(2);
	    U1.UpdateAnnonce(A);*/
		
		/*A.setId(3);
		U1.DeleteAnnonce(A);*/
		
		/*String p = "t-shirt bon état";
		int b =1;
	    List<Announcement> liste = U1.rechercheAnnonceByNomCategoryPrice(p,b);
	        for (Announcement bc : liste ) {
	              System.out.println(bc);}*/
    	    
	    
	  //  --------------- Affichage de users ------------- //
		    
	   UtilisateurDAOImpl U2 = new UtilisateurDAOImpl();
	   User user =new User();
	 
	   List<User> listeUser = U2.getAllUsers();
		    for (User U : listeUser ) {
		       System.out.println(U);}
		    
	/*User user = new User(4, "Elivar", "Largo","Johny", "johnyPirate@Cara.com", "unmotdepassedepirate", "1563214560", "Entre l'atlantic et le pacific.",1);	
	  U2.Register(user);*/
		    
	  /*user.setId(1); 
	  user.setFirstname("Alex");
	  user.setName("ughn");
	  user.setPseudo("alexandre");
	  user.setMail("alex@gmail.com");
	  user.setU_password("alex");
	  user.setPhone("145236987");
	  user.setAddress("paris");
	  user.setRole_id(1);
	  U2.UpdateUser(user); */ 
	  

	//  --------------- Affichage de Role ------------- //
	/* UtilisateurDAOImpl U2 = new UtilisateurDAOImpl();
	   List<Role> liste = U2.getAllRoles();
	     for (Role r : liste )
	      {
	       System.out.println(r);
	       }*/
	//  --------------- Affichage de Favoris ------------- //
		
	    FavorisDaoImpl U3 = new FavorisDaoImpl();
	    U3.getAllFavoris();
	    List<Favoris> listf = U3.getAllFavoris();
	    for (Favoris F : listf ) {
	       System.out.println(F);}
	   
	    Favoris F = new Favoris();
	    
	    /*F.setId(3);
	    F.setAnnouncement_id(1);
		F.setUser_id(2);
		F.setDateAjout("2011-12-26");
		U3.createFavoris(F);*/	   
	    /* F.setId(1);
	    F.setAnnouncement_id(2);
		F.setUser_id(1);
		F.setDateAjout("1999-12-26");
		U3.UpdateFavoris(F);*/
	    
	    /*F.setId(3);
	    U3.DeleteFavoris(F);*/
	    
	//  --------------- Affichage de recherche ------------- //    
	    RechercheDaoImpl U4 = new RechercheDaoImpl();
	   
	    List<Recherche> listr = new ArrayList<Recherche>();
	    listr =  U4.getAllRecherche();
	    for (Recherche R1 : listr ) 
	    {
	       System.out.println(R1);
	       
	    }
	    
	    Recherche R = new Recherche();
	    
	   /* R.setId(4);
	    R.setType_habit("pantalon");
	    R.setTaille("m");
	    R.setCouleur("gris");
	    R.setFourchette_prix(25);
	    R.setUser_id(2);
	    U4.createRecherche(R);*/
	    	    
	   /* R.setId(1);
	    R.setType_habit("jupe");
	    R.setTaille("xl");
	    R.setCouleur("noir");
	    R.setFourchette_prix(25);
	    R.setUser_id(2);
	    U4.UpdateRecherche(R);*/
	    
	    
	   /*R.setId(2); 
	   U4.DeleteRecherche(R);*/
	    
	    
	    
	}

}
