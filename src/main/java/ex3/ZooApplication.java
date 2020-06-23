package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		// Creation du zoo
		Zoo zoo = new Zoo("Thoiry");
		// Ajout des animaux
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));
		// test de l'affichage
		zoo.afficherListeAnimaux();
	}

}
