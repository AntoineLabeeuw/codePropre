package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui conceptualise une zone quelconque d'un zoo
 * 
 * @author antoinelabeeuw
 *
 */
public abstract class ZoneATheme {
	/** liste des animaux */
	protected List<Animal> listeAnimaux;

	/**
	 * Constructeur
	 *
	 */
	public ZoneATheme() {
		super();
		this.listeAnimaux = new ArrayList<Animal>();
	}

	/**
	 * Methode qui permet d'ajouter un animal a la liste
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}

	/**
	 * methode qui permet d'afficher la liste des animaux dans la zone
	 * 
	 */
	public void afficherListeAnimaux() {
		for (Animal a : listeAnimaux) {
			System.out.println(a);
		}
	}

	/**
	 * methode qui permet de retourner le nombre d'animaux dans la zone
	 * 
	 * @return : int du nombre d'animaux dans la zone
	 */
	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	/**
	 * methode qui permet de calculer le nombre de Kgs de nourriture par jour de la
	 * zone
	 * 
	 * @return : un double du Kgs de nourriture par jour necessaire
	 */
	public abstract double calculerKgsNourritureParJour();

}
