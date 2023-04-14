import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cola = scn.nextInt();
        int people = scn.nextInt();
        double sum = 1.0 * cola / people;
        System.out.println(sum);

    }
}