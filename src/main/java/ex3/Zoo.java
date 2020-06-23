package ex3;

/**
 * Classe qui conceptualise un zoo dans son ensemble
 * 
 * @author DIGINAMIC
 */
public class Zoo {

	/** nom */
	private String nom;
	/** savane africaine */
	private SavaneAfricaine savaneAfricaine;
	/** zone carnivore */
	private ZoneCarnivore zoneCarnivore;
	/** ferme a reptile */
	private FermeReptile fermeReptile;
	/** aquarium */
	private Aquarium aquarium;

	/**
	 * Constructeur
	 * 
	 * @param nom : le nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	/**
	 * methode qui permet d'ajouter un animal au zoo, dans la bone zone de celui-ci
	 * 
	 * @param animal : un objet de type animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType().equals("REPTILE")) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals("POISSON")) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * methode qui permet d'afficher la liste des animaux du zoo entier
	 * 
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
