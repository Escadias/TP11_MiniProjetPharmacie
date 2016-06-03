package pharmacie;

public class MedicamentControleur {
	

    private EcranUtilisateur  ecranUtilisateur;
    private MedicamentsGestionnaire  medicamentsGestionnaire;
    private VenteControleur  venteControleur;

    public EcranUtilisateur getEcranUtilisateur() {
		return ecranUtilisateur;
	}

	public void setEcranUtilisateur(EcranUtilisateur ecranUtilisateur) {
		this.ecranUtilisateur = ecranUtilisateur;
	}

	public MedicamentsGestionnaire getMedicamentsGestionnaire() {
		return medicamentsGestionnaire;
	}

	public void setMedicamentsGestionnaire(MedicamentsGestionnaire medicamentsGestionnaire) {
		this.medicamentsGestionnaire = medicamentsGestionnaire;
	}

	public VenteControleur getVenteControleur() {
		return venteControleur;
	}

	public void setVenteControleur(VenteControleur venteControleur) {
		this.venteControleur = venteControleur;
	}

	public void mettreAjourStockMedic() {
    }

    public void rechercheMedic() {
    }

    public void nouveauMedic() {
    }

    public void formaterAffichageMedic() {
    }

}