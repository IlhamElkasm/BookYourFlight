package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="airport")
public class Airport {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int ID_Airport;
	private String Nom ;
	private String Ville_départ;
	private String Ville_arrivée;
	private String Pays;
	public Airport() {
	
	}
	public Airport(String nom, String ville_départ, String ville_arrivée, String pays) {
		super();
		Nom = nom;
		Ville_départ = ville_départ;
		Ville_arrivée = ville_arrivée;
		Pays = pays;
	}
	public int getID_Airport() {
		return ID_Airport;
	}
	public void setID_Airport(int iD_Airport) {
		ID_Airport = iD_Airport;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getVille_départ() {
		return Ville_départ;
	}
	public void setVille_départ(String ville_départ) {
		Ville_départ = ville_départ;
	}
	public String getVille_arrivée() {
		return Ville_arrivée;
	}
	public void setVille_arrivée(String ville_arrivée) {
		Ville_arrivée = ville_arrivée;
	}
	public String getPays() {
		return Pays;
	}
	public void setPays(String pays) {
		Pays = pays;
	}
	
	
}
