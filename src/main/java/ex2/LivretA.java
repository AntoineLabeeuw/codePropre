package ex2;

/**
 * représente un compte LivretA
 * 
 * @author antoinelabeeuw
 *
 */
public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param solde            représente le solde du compte
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajoute la rémunération annuelle au solde
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
