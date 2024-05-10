package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="utilisateur")
public class Utilisateur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int ID_Utilisateurs;
	private String Nom;
	private String Email;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String email) {
		super();
		Nom = nom;
		Email = email;
	}
	public int getID_Utilisateurs() {
		return ID_Utilisateurs;
	}
	public void setID_Utilisateurs(int iD_Utilisateurs) {
		ID_Utilisateurs = iD_Utilisateurs;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	} 
	
	
}
