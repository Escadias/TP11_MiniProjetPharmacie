package pharmacie;
import java.util.ArrayList;
import java.util.Iterator;

public class Vente {
	
	//attributs
    private Facture  facture;
    private Vendeur vendeur;
    private Client client;
   
    private ArrayList<Medicament>  medicamentsVendus_liste;

    public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public ArrayList<Medicament> getMedicamentsVendus_liste() {
		return medicamentsVendus_liste;
	}

	public void setMedicamentsVendus_liste(ArrayList<Medicament> medicamentsVendus_liste) {
		this.medicamentsVendus_liste = medicamentsVendus_liste;
	}

	public float calculPrixTot(){
		Iterator<Medicament> it = this.getMedicamentsVendus_liste().iterator();
		
		while (it.hasNext()){
			
			
		}
	}
	public void creeFacture() {
    	Facture f = new Facture();
    	
    }

    public void voirFacture() {
    }

    public void supprimerFacture() {
    }

    public void ajoutMedicVendu(Medicament m) {
    	
    }

}