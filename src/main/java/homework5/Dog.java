package homework5;

public class Dog extends Animals{
    public Dog(AnimalsType animalType, String sound, String name) {
        super(animalType, sound);
        super.setName(name);
    }
}
