package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="réservation")
public class Réservation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int ID_Réservations;
	
	@OneToOne
    @JoinColumn(name = "ID_Utilisateurs")
	private Utilisateur utilisateur;
	
	@OneToOne
    @JoinColumn(name = "ID_Siege")
	private Siège siège;
	
	@OneToOne
    @JoinColumn(name = "ID_passager")
	private Passager passager;
	private String détails_passagers;
	public Réservation() {
	
	}
	public Réservation(Utilisateur utilisateur, Siège siège, String détails_passagers) {
		super();
		this.utilisateur = utilisateur;
		this.siège = siège;
		this.détails_passagers = détails_passagers;
	}
	public int getID_Réservations() {
		return ID_Réservations;
	}
	public void setID_Réservations(int iD_Réservations) {
		ID_Réservations = iD_Réservations;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Siège getSiège() {
		return siège;
	}
	public void setSiège(Siège siège) {
		this.siège = siège;
	}
	public String getDétails_passagers() {
		return détails_passagers;
	}
	public void setDétails_passagers(String détails_passagers) {
		this.détails_passagers = détails_passagers;
	}
	
	
}
