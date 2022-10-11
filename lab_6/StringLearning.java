package baitap.lab_6;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String myPass = "123myPassword";
        char[] myCharacters = myPass.toCharArray();
        System.out.println(Arrays.toString(myCharacters));


        int digitCount, lowerCaseCount, upperCaseCount;
        digitCount = lowerCaseCount = upperCaseCount = 0;
        for (char character : myCharacters) {
            if (Character.isDigit(character))
                digitCount++;
            else if (Character.isLowerCase(character)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(character)) {
                upperCaseCount++;
            }
        }
        if (digitCount > 0 && lowerCaseCount > 0 && upperCaseCount > 0){
            System.out.println("Hop le");
        }
        else
            System.out.println("Khong hop le");


        // Immutable
        String badWordContainer = "    bad, very bad, something else, bad    ";
        String filterStr = badWordContainer.replace("bad","b**");
        filterStr = filterStr.trim();
        System.out.println(filterStr);

        // subString, indexOf, split
        String url = "https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));


        System.out.println(url.indexOf("o"));
        System.out.println(url.indexOf("https1"));

        String[] splitStr = url.split("o");
        System.out.println(Arrays.toString(splitStr));

        //$10, 230.000 vnd
        // regular expression (regex)
        String cookiesTimeStr = "100mins";
        String cookiesTimeNumStr = cookiesTimeStr.replaceAll("[^0-9]","");
        System.out.println(cookiesTimeNumStr);
        System.out.println(cookiesTimeNumStr + 1);
        System.out.println(Integer.parseInt(cookiesTimeNumStr) + 1);

        //Concat | concatenation

        String s1 = "Hello";
        System.out.println(s1.concat(" Teo") + ", my name is ...:".concat("tijj"));

        // StringBuilder
        // tai sao can java, tai sao can IDE,
    }
}
