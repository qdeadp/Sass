import java.util.Scanner;

/**
 * Converts centimeters to feet and inches.
 */

public class kodutöö3 {
    public static void main(String[] args) {

        double celcius;
        double Farenheit;
        Scanner in = new Scanner(System.in);
        celcius = in.nextDouble();
        Farenheit = celcius * 9 / 5 + 32;

        System.out.printf("%.2f C = %.1f F", celcius, Farenheit);


    }

}
