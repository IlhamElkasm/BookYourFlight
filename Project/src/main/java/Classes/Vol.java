package Classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="vol")
public class Vol {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int ID_vols;
	
	@OneToOne
    @JoinColumn(name = "ID_Airport")
	private Airport airport;
	
	private String Compagnie;
	private String DateDépart;
	private String DateArrivée;
	private int Prix;
	
	
	public Vol() {
		
	}

	public Vol(String compagnie, String dateDépart, String dateArrivée, int prix) {
		Compagnie = compagnie;
		DateDépart = dateDépart;
		DateArrivée = dateArrivée;
		Prix = prix;
	}




	public int getID_vols() {
		return ID_vols;
	}

	public void setID_vols(int iD_vols) {
		ID_vols = iD_vols;
	}

	public String getCompagnie() {
		return Compagnie;
	}


	public void setCompagnie(String compagnie) {
		Compagnie = compagnie;
	}


	public String getDateDépart() {
		return DateDépart;
	}


	public void setDateDépart(String dateDépart) {
		DateDépart = dateDépart;
	}


	public String getDateArrivée() {
		return DateArrivée;
	}


	public void setDateArrivée(String dateArrivée) {
		DateArrivée = dateArrivée;
	}


	public int getPrix() {
		return Prix;
	}


	public void setPrix(int prix) {
		Prix = prix;
	}
	
}
