package Lab3;

import java.util.Scanner;

public class Lap3_2 {
    public static void main(String[] args) {
        int n,i, min, max;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls enter number of Array: " );
        n = scanner.nextInt();
        int [] myNumber = new int[n];

        System.out.print("Pls enter the elements of the array: ");
        for(i = 0; i < n; i++){
            myNumber[i] = scanner.nextInt();
        }
        max = myNumber[0];
        min = myNumber[0];
        for (i = 0; i < n; i++){
            if(myNumber[i] > max){
                max = myNumber[i];
            }
            if(myNumber[i] < min){
                min = myNumber[i];
            }
        }
        System.out.println("Minimum number is: " +min);
        System.out.println("Maximum number is: " +max);
    }
}
