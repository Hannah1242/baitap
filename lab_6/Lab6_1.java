package baitap.lab_6;

public class Lab6_1 {
    public static void main(String[] args) {
        String a = "2hrs and 5 minutes";
        int minutes = 0;
        String[] words = a.split(" ");
        minutes +=Integer.parseInt(words[2]);
        minutes += Integer.parseInt(String.valueOf(words[0].charAt(0))) * 60;
        System.out.println(String.format("Total minutes is: %d", minutes));
    }
}
