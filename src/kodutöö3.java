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

        System.out.printf("%.2f C = %.1f F\n", celcius, Farenheit);

        //aja kalkulaator
        int s;
        int tundesekundites, minuteidtunnis, allesminuteid, allessekundeid, sekundid;

        //küsib palju sekundeid
        System.out.println("Mitu sekundit?");
        s = in.nextInt();
        //kuvab
        tundesekundites = s / 3600;
        minuteidtunnis = s % 3600;
        allesminuteid = minuteidtunnis / 60;
        sekundid = minuteidtunnis % 60;
        System.out.printf("%d sekundeid on %d tund %d minuteid ja %d sekundeid", s, tundesekundites, allesminuteid, sekundid);


    }




    }


