/**
 * Created by Aleks on 21-Oct-16.
 */

import java.util.Scanner;

public class Inputandoutput {

    public static void main(String[] args)

    {
        System.out.println("\tChapter 3 \n");
        System.out.println(System.out);

        String line;

        Scanner in = new Scanner(System.in);

        line = in.nextLine();
        System.out.println(line);

        String nimi;
        System.out.print("Mis on sinu nimi ?");
        nimi = in.nextLine();
        System.out.print("Sa ütlesid, et su nimi on, ");
        System.out.print(nimi);
        System.out.println(" ?");


        System.out.println("\n\tConverter");

        int inch, mm;
        Double cm;
        System.out.print("Palju Teil sadas lund eile (Tollides)?");
        inch = in.nextInt();
        final double CM_PER_INCH = 2.54;
        final double IN_PER_FOOT = 100;
        cm = inch * CM_PER_INCH;
        mm = (int) (cm * IN_PER_FOOT);
        System.out.printf("%.2f mm", cm, mm);

        System.out.print("See teeb siis: ");
        System.out.printf("%.2f", cm);
        System.out.print(" sentimeetrit.");


    }


}
