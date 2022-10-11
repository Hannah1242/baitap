package Lab_2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so a: ");
        a = scanner.nextInt();
        if(a%2 == 0){
            System.out.println(a + "\tla so chan");
        } else {
            System.out.println(a + "\tla so le");
        }
    }
}
