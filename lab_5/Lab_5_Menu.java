package baitap.Lab_5;

import java.util.*;

public class Lab_5_Menu {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();

        boolean isContinuing = true;

        while (isContinuing) {
            printGameMenu();
            int userOption = getUserOption();


            switch (userOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    int n;
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Pls enter number of Array List: ");
                    n = scanner.nextInt();
                    System.out.print("Please enter an element for the list: ");
                    for (int i = 0; i < n; i++) {
                        myArr.add(scanner.nextInt());
                    }
                    break;
                case 2:
                        System.out.println("ArrayList: " +myArr);
                    break;
                case 3:
                    int myArrlength  = myArr.size();
                    Set<Integer> set = new HashSet<>(myArr);
                    System.out.println("Maximum number is: " +myArr.get(myArrlength-1));
                    break;
                case 4:
                    System.out.println("Minimum number is: " +myArr.get(0));
                    break;
                case 5:
                    System.out.println("Chua co chuc nang nay!! ");
                default:
                    System.out.println("Nhap sai roi!!");

            }
        }
    }

        private static void printGameMenu () {
            System.out.println("== Game menu ==");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Choose any number to see its position");
            System.out.println("0. Exit!");
        }

        private static int getUserOption () {
            System.out.println("Please input option \n");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
}