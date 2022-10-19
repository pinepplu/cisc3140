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
        /*
        //allow user to input dates
        Scanner input = new Scanner(System.in);
        //boolean date = input.hasNext("MMDDYYYY");
        System.out.println("input date(MMDDYYYY): ");
        while(input.hasNextLong()) {
            //System.out.println("days until due date: " + daysBetweenDates(now, date) + " days");
        }
        input.close();
         */
        //display
        display(daysBetweenDates(now, lab1));
        display(daysBetweenDates(now, lab2));
        display(daysBetweenDates(now, lab3));
        display(daysBetweenDates(now, lab4));
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
