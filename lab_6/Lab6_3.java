package baitap.lab_6;

import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = scanner.nextLine();
        char[] charArray = text.toCharArray();
        String result = "";
        for (char character : charArray) {
            if(Character.isDigit(character)) {
                result += character;
            }
        }
        System.out.println("Result: " + result);
    }
}
