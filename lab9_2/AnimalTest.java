package baitap.lab9_2;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();
        Animal horse = new Horse();
        Animal horse1 = new Horse();

        List<Animal> animalList = Arrays.asList(tiger, dog, dog2, dog3, horse, horse1);
        List<Animal> listSpeedAnimal = AnimalObject.getListSpeedAnimal(animalList);
        System.out.println("Winner is : " + AnimalObject.getResult(listSpeedAnimal));
    }
}
