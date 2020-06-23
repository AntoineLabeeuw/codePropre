package ex3;

/**
 * Classe qui conceptualise la zone carnivore d'un zoo
 * 
 * @author antoinelabeeuw
 *
 */
public class ZoneCarnivore extends ZoneATheme {

	/**
	 * Constructeur
	 * 
	 */
	public ZoneCarnivore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 10;
	}
}
