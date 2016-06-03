package pharmacie;


public class EcranUtilisateur {
	
    private MedicamentControleur medicamentControleur;
    private MedicamentControleur venteControleur;

    
  
	public MedicamentControleur getMedicamentControleur() {
		return medicamentControleur;
	}

	public void setMedicamentControleur(MedicamentControleur medicamentControleur) {
		this.medicamentControleur = medicamentControleur;
	}

	public MedicamentControleur getVenteControleur() {
		return venteControleur;
	}

	
	public void setVenteControleur(MedicamentControleur venteControleur) {
		this.venteControleur = venteControleur;
	}

	
	
	
	public void afficherMedic() {
    }

    public void afficherRecettes() {
    }

    public void afficherVente() {
    }

    public void afficherFacture() {
    }

    public void recueillirSaisieVente() {
    }

    public void recueillirSaisieMedic() {
    }

    public void recueillirSaisieRecette() {
    }

}