import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class dates {
    public static void main(String[] args) {
        //current date
        LocalDate now = LocalDate.now();
        System.out.println("current date: " + now);
        //due dates
        LocalDate lab1 = LocalDate.of(2022, 9, 28);
        LocalDate lab2 = LocalDate.of(2022, 10, 26);
        LocalDate lab3 = LocalDate.of(2022,11, 23);
        LocalDate lab4 = LocalDate.of(2022, 12, 7);
        System.out.println("lab 1: " + lab1 + "\nlab 2: " + lab2 +
        "\nlab 3: " + lab3 + "\nlab 4: " + lab4);
        //allow user to input dates
        Scanner input = new Scanner(System.in);
        //String user = input.next("MMDDYYYY");
        System.out.println("input date(MMDDYYYY): ");
        while (input.hasNext("MMDDYYYY")) {
            //check if input matches pattern else print error message
            if(input.hasNext("MMDDYYYY")) {
                System.out.println("date: " + input);
            } else {
                System.out.println("ERROR: date in wrong format");
            }
            //display(daysBetweenDates(now, user));
        } 
        input.close();
        //output file, use printwriter
    }
    /**
     * method calculates number of days between 2 dates
     * @param now -- current date
     * @param date -- date of comparison
     * @return - number of days between dates
     */
    public static long daysBetweenDates(LocalDate now, LocalDate date) {
        long days = ChronoUnit.DAYS.between(now, date);
        return days;
    }
    /**
     * displays output
     * @param days until due date
     */
    public static void display (long days) {
        //nagative days between dates
        if(days < 0) {
            System.out.println("past due: " + days*-1 + " days");
        } else {
            System.out.println("days until due date: " + days + " days");
        }
    }
}
