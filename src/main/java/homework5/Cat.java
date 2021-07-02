package homework5;

public class Cat extends Animals {

    public Cat(AnimalsType animalType, String sound, String name) {
        super(animalType, sound);
        super.setName(name);

    }
}
