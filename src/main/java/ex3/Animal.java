package ex3;

/**
 * Classe qui conceptualise un animal
 * 
 * @author antoinelabeeuw
 *
 */
public class Animal {
	/** nom */
	private String nom;
	/** type */
	private String type;
	/** comportement */
	private String comportement;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Getter
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

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return "Animal = " + nom + ", type= " + type + ", comportement= " + comportement;
	}

}
