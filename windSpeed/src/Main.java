import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int wind = scn.nextInt();
        double windSpeed =  3.6;
        double sum = (wind * windSpeed);
        int kilo = (int) Math.round(sum);
        System.out.println(kilo);
    }
}