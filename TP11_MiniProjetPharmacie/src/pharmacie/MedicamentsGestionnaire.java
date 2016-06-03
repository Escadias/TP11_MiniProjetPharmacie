package pharmacie;
import java.util.ArrayList;

public class MedicamentsGestionnaire {
	
	private ArrayList  stockMedicaments;
	private MedicamentControleur medicamentControleur;

	public void creeMedicament() {
	}

	public void modifierQuantiteMedic(Medicament m, int quantite) {
		m.setQuantite(quantite);
	}

	public Medicament retourneMedicamentRecherche() {
		return null;
	}

	public void supprimerMedic(Medicament m) {
		
	}

}