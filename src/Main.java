import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, fare;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance traveled (in KM): ");
        km = input.nextDouble();

        fare = Math.max(20, 10 + (km * 2.20));

        System.out.println("Total taxi fare: " + fare + " TL");
    }
}