package Lab_2;

import java.util.Scanner;

public class IfelesStatement {
    public static void main(String[] args) {
        final int Exected_time = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();


        //compare operator: ==, !=, <, >, <=, >=
     //   boolean isHeOnTime = arrivalTime == Exected_time;

        //Ternary operator | Toan tu 3 ngoi
        boolean isHeOnTime = arrivalTime == Exected_time ? true:false;


        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        if(isHeOnTime){
            System.out.println("\t ---->Let's talk!");
        }else {
            System.out.println("\t ---->Write a letter!");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }
}
