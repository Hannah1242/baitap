package baitap.lab_6;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String s = url.substring(0, url.indexOf(":"));
        String topDomain = url.split("\\.")[1];
        String domain = url.replace("." + topDomain, "");
        domain = domain.replace(s+ "://", "");
        System.out.println("Your url is: " + s);
        System.out.println("Your url domain is: " + domain);
        System.out.println("Your URL is: ." + topDomain);
    }
}
