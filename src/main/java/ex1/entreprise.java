package ex1;

import java.util.Date;

/**
 * Classe qui conceptualise une entreprise
 * 
 * @author antoinelabeeuw
 *
 */
public class entreprise {

	/** numero de siret */
	public int siret;
	/** nom de l'entreprise */
	public String nom;
	/** adresse */
	public String adresse;
	/** date de creation */
	public Date dateCreation;

	/** capital maximum */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * methode qui permet d'afficher le statut de l'entreprise
	 */
	public void afficherStatut() {

	}

}
