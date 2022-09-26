package baitap.Lab_5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {

        List<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(4);
        System.out.println("Before insert: " + myArr);
        int indexToInsert = 2;
        int valueToInsert = 3;
        myArr.add(indexToInsert, valueToInsert);
        System.out.println("After insert: " + myArr);

        myArr.set(3,4);
        System.out.println("After updating: " + myArr);

        myArr.remove(3);
        System.out.println("After deleting: " + myArr);

        System.out.println(myArr.isEmpty());
        System.out.println(myArr.contains(10));
        System.out.println(myArr.indexOf(10));


    }
}
