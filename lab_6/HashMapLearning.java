package baitap.lab_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");

        System.out.println(emergencyList.get(113));
        //dot notaytion (danh dau)
        Set<Integer> allKeys = emergencyList.keySet();
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
        /*
         * loop over all values
         *  if the value is equals "Others"
         *    then remove
         *
         * */

        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.remove(key);
            }
        }
        for (Integer key : emergencyList.keySet()) {
            emergencyList.remove(key, "Others");
        }

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));

        }
    }
}