package Lab_2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        double weight;
        double height;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Your height is (m) (ex: 1m75 -> 1.75): ");
        height = scanner.nextFloat();
        System.out.print("Your weight is (kg): ");
        weight = scanner.nextFloat();

        double mbi = ((weight) / (height * 2));
        double roundOff = Math.round(mbi * 100) / 100.00;
        double x = 18.6 * (height * 2);
        double y = 24.9 * (height * 2);

        if (mbi < 18.5) {
            System.out.println("Your MBI is: \t" + roundOff + "\n--->Underweight");
            System.out.println("You should increase at least:\t" + (int) (x - weight) + "(kg) to " + (int) (y - weight) + "(kg)");
        } else if (mbi <= 24.9) {
            System.out.println("Your MBI is: \t" + roundOff + "\n--->Normal weight");
            System.out.println("You have a good health. Keep Goging!!");
        } else if (mbi <= 29.9) {
            System.out.println("Your MBI is: \t" + roundOff + "\n--->Overweight ");
            if ((weight - y) > 1) {
                System.out.println("You should decrease at least:\t" + (int) (weight - y) + "(kg) to " + (int) (weight - x) + "(kg)    ");
            } else {
                System.out.println("You have a good health. Keep Goging!!");
            }
        } else {
            System.out.println("Your MBI is: \t" + roundOff + "\n--->Obesity ");
            System.out.println("You should decrease at least\t" + (int) (weight - y) + "(kg) to " + (int) (weight - x) + "(kg)");
        }
    }
}
