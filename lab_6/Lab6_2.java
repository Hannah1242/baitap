package baitap.lab_6;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int times = 3;
        boolean isLogin = false;
        while(times > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your password: ");
            String password = scanner.nextLine();
            if(myPassword.equals(password)) {
                System.out.println("Loggin successful!!!");
                isLogin = true;
                break;
            }
            times--;
        }
        if(!isLogin) {
            System.out.println("Wait 30 minutes to login again");
        }
    }
}
