package Lab3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        int n,i;
        int evenCount = 0, oddCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls enter number of Array: " );
        n = scanner.nextInt();
        int [] myNumber = new int[n];

        System.out.print("Pls enter the elements of the array: ");
        for(i = 0; i < n; i++){
            myNumber[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            if(myNumber[i] % 2 == 0 || myNumber[i] == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Total even Number: " +evenCount);
        System.out.println("Total odd Number: " +oddCount);


    }
}
