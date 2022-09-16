package Lab3;

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        int n, i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input an array number: ");
        n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Pls enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = arr[0];
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
