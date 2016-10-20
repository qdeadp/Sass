/**
 * Created by Aleks on 19-Oct-16.
 */
//aitab
public class Date {

    public static void main(String[] args) {

        System.out.println("Exercise 2.2");


        String day, month;
        int date, year;


        day = "\nThursday, ";
        date =20;
        month = "October ";
        year  = 2016;

        System.out.print(day);
        System.out.print(month);
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);

        System.out.println("\nExercise 2.3");
        System.out.print("Time.java\n");

        int hour, minute, second;
        Double overall;
        Double passed;
        hour = 12;
        minute = 1;
        second = 55;
        System.out.println(24*60*60);
        overall = 86400.00;
        passed = 43315.00;
        System.out.print("It has been: ");
        System.out.print(hour*60*60 + minute*60 + second);
        System.out.println(" seconds since midnight");
        System.out.print("There are: ");
        System.out.print(overall-passed);
        System.out.println(" seconds left till the end of the day");


        System.out.print(100*passed/overall);
        System.out.print("% of the day has passed");
    }
}
