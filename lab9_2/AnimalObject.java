package baitap.lab9_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalObject {
    public static List getListSpeedAnimal(List<Animal> list){
        List<Animal> animalList = new ArrayList<>();
        int speed;
        for (Animal animal : list) {
            speed = new SecureRandom().nextInt(animal.getMaxSpeed());
            animalList.add(new Animal().setName(animal.getName()).setSpeed(speed));
        }
        return animalList;
    }
    public static String getResult(List<Animal> list){
        int maxSpeed = list.get(0).getSpeed();
        String winner = list.get(0).getName();

        for (Animal animal : list) {
            if (maxSpeed < animal.getSpeed()){
                maxSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return  winner;
    }
}
