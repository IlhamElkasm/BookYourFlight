package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="passager")
public class Passager {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int  ID_passager;
	private String Nom;
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passager(String nom) {
		super();
		Nom = nom;
	}
	public int getID_passager() {
		return ID_passager;
	}
	public void setID_passager(int iD_passager) {
		ID_passager = iD_passager;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	
}
