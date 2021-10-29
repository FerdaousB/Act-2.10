package entities;

import java.sql.Date;

public class Favoris {
	
	private int id;
	private int announcement_id; 
	private int user_id ; 
	private Date dateAjout;
	
	
	public Favoris() {
	}


	public Favoris(int id, int announcement_id, int user_id, Date dateAjout) {
		this.id = id;
		this.announcement_id = announcement_id;
		this.user_id = user_id;
		this.dateAjout = dateAjout;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAnnouncement_id() {
		return announcement_id;
	}


	public void setAnnouncement_id(int announcement_id) {
		this.announcement_id = announcement_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public Date getDateAjout() {
		return dateAjout;
	}


	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}


	@Override
	public String toString() {
		return "Favoris [id=" + id + ", announcement_id=" + announcement_id + ", user_id=" + user_id + ", dateAjout="
				+ dateAjout + "]";
	}
	
	
	

}
