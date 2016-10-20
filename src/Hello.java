/**
 * Created by Aleks on 18-Oct-16.
 */
public class Hello {
    // testing comments
    public static void main(String [] args)
    {
        //et see prindiks ekraanile suvalise teksti
        System.out.println("------------------------------------\n chapter 1");
        System.out.print("Hello world!");
        System.out.println(",and Hello me!");

        System.out.println("Hei \nProovime selliselt\n");
        System.out.println("She\n\tsaid\n\t\tHello!\n\t\t\tTo me");
        System.out.println("------------------------------------\n chapter 2");

        String EesNimi;
        String Perekonnanimi;
        String Vanus;
        int tund, minut, sekund;

        EesNimi = "Sass";
        Perekonnanimi ="Erm";
        Vanus = "27";
        tund = 11;
        minut = 38;
        sekund = 50;

        System.out.print("\nTere, minu nimi on ");
        System.out.println(EesNimi+Perekonnanimi);
        System.out.print("\n10 minutit tagasi oli kell ");
        System.out.print(tund);
        System.out.print(":");
        System.out.print(minut);
        System.out.print(":");
        System.out.println(sekund);

        System.out.print("Tänane päev on kestnud: ");
        System.out.print(tund*60*60 + minut*60 + sekund);
        System.out.println(" sekundit");

        Double Pi;
        Pi = 3.14225455;
        System.out.print("Pi on umbes: ");
        System.out.println(Pi);

        Double Minute;
        Minute = 36.5;
        System.out.print("36 minutit on: ");
        System.out.print(Minute / 60);
        System.out.println(" osakut tunnist");


        Double y;
        y = 0.5 / 0.2;
        System.out.print("0,5*0,2= ");
        System.out.println(y);

        int x = 5*5;
        System.out.print("5*5*25= ");
        System.out.println(x*25);

        System.out.println(0.1*10);
        System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);

        System.out.println( 1 + 3 + "Hello");
        System.out.println("Hello" + 1 + 2 );



    }


}
