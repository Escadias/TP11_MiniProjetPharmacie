package pharmacie;
import java.util.Date;

public class Facture {
	
	
	private Date date;
	private float prixTot;
	private Vente ventes;
	
	
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public float getPrixTot() {
		return prixTot;
	}
	
	public void setPrixTot(float prixTot) {
		this.prixTot = prixTot;
	}


	public Vente getVentes() {
		return ventes;
	}

	
	public void setVentes(Vente ventes) {
		this.ventes = ventes;
	}

	  
	
	
}