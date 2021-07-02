package homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animals {
    public int amount;
    private AnimalsType animalsType;
    public static double usy;
    private String sound;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public void setAmountmount(final int amount)
    {
        this.amount = amount;
    }
    public void setAnimalType(final AnimalsType animalsType){

        this.animalsType = animalsType;
    }

    public void setUsy(final double usy){

        Animals.usy = usy;
    }

    @Override
    public String toString() {

        return "Это животное" + animalsType + "умеет" + sound;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, animalsType, sound);
    }

    public Animals(final AnimalsType animalType, final String sound){
        this.animalsType = animalType;
        this.sound = sound;
    }

    void makeSound(String sound){
        System.out.println(sound);
    }

    static void move(){
        System.out.println("пошел");
    }
}
