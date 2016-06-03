package pharmacie;
import java.util.Date;

public class Facture {
	
	
	private Date date;
	private float prixTot;
	private Vente vente;
	
	Facture(Date date, float prixTot, Vente vente){
		this.setDate(date);
		this.setPrixTot(prixTot);
		this.setVente(vente);
	}
	
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


	public Vente getVente() {
		return vente;
	}

	
	public void setVente(Vente vente) {
		this.vente = vente;
	}

	  
	
	
}