package baitap.Lab_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(1);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(5);
        myArrList.add(4);

        // ascending
        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);

        List<Integer> listFromSet = new ArrayList<>(set);
        List<Integer> list3Num = listFromSet.subList(0,3);
        System.out.println(list3Num);
    }
}
