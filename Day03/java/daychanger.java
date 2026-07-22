package Day03.java;

import java.util.Scanner;

enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Fridsy,
    Saturday,
    Sunday
}

public class daychanger {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String input = sc.next();

        Day day = Day.valueOf(input);

        int index = (day.ordinal() + 30) % 7;
        Day result = Day.values()[index];

        if(result==Day.Saturday || result == Day.Sunday){
            result = Day.Monday;
        }

        System.out.println("Week day after 30 days: "+ result);
        sc.close();
    }
}
