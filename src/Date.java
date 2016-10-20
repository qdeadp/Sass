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

        int hour, minute, second, from;
        hour = 14;
        minute = 5;
        second = 55;
        from = 43315;

        Double overall;
        Double passed;
        Double remaining;
        overall = 24.00*60.00*60.00;
        remaining = overall - (hour*60*60 + minute*60 + second);
        passed = hour*60.00*60.00 + minute*60.00 + second;

        System.out.print("It has been: ");
        System.out.print(hour*60*60 + minute*60 + second);
        System.out.println(" seconds since midnight");
        System.out.print("There are: ");
        System.out.print(remaining);
        System.out.println(" seconds left till the end of the day");


        System.out.print(100* passed / overall);
        System.out.println("% of the day has passed");

        System.out.print("I have been working on this stuff for: ");
        System.out.print(passed-from);
        System.out.println(" seconds now. ");
        System.out.print("That is: ");
        System.out.print(passed/60-from/60);
        System.out.print(" minutes. ");




    }
}
