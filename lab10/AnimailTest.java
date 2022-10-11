package baitap.lab10;
import javafx.util.Builder;

import java.util.Arrays;
public class AnimailTest {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder(50, "Tiger").withWings(false).build();
        Animal eagle = new Animal.Builder(120, "Eagle").withWings(true).build();
        Animal bird = new Animal.Builder(100, "Bird").withWings(true).build();
        Animal horse = new Animal.Builder(70, "horse").withWings(false).build();

        Animal winner = Animal.findTheWinner(Arrays.asList(tiger, eagle, bird, horse));
        System.out.println(winner.toString());
    }
}
