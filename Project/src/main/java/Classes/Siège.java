package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Siège")
public class Siège {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int ID_Siege;
	@OneToOne
    @JoinColumn(name = "ID_vols")
    private Vol vol;
	
	private int  Number_Siege;
	private Boolean état_siège;
	public Siège() {
	}
	public Siège(Vol vol, int number_Siege, Boolean état_siège) {
		super();
		this.vol = vol;
		Number_Siege = number_Siege;
		this.état_siège = état_siège;
	}
	public int getID_Siege() {
		return ID_Siege;
	}
	public void setID_Siege(int iD_Siege) {
		ID_Siege = iD_Siege;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public int getNumber_Siege() {
		return Number_Siege;
	}
	public void setNumber_Siege(int number_Siege) {
		Number_Siege = number_Siege;
	}
	public Boolean getÉtat_siège() {
		return état_siège;
	}
	public void setÉtat_siège(Boolean état_siège) {
		this.état_siège = état_siège;
	}
	
	
}
