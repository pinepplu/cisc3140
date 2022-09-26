import java.time.LocalDate;
import java.time.Period;

/**
 * lab1
 */
public class lab1 {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println("today's date: " + current);
        LocalDate lab1 = LocalDate.of(2022, 9, 28);
        LocalDate lab2 = LocalDate.of(2022, 10, 26);
        LocalDate lab3 = LocalDate.of(2022,11, 23);
        LocalDate lab4 = LocalDate.of(2022, 12, 7);
        Period dlab1 = Period.between(current, lab1);
        Period dlab2 = Period.between(current, lab2);
        Period dlab3 = Period.between(current, lab3);
        Period dlab4 = Period.between(current, lab4);
        System.out.println("days until lab 1 due date: " + dlab1.getMonths() + " month(s) " + dlab1.getDays() + " day(s)");
        System.out.println("days until lab 2 due date: " + dlab2.getMonths() + " month(s) " + dlab2.getDays() + " day(s)");
        System.out.println("days until lab 3 due date: " + dlab3.getMonths() + " month(s) " + dlab3.getDays() + " day(s)");
        System.out.println("days until lab 4 due date: " + dlab4.getMonths() + " month(s) " + dlab4.getDays() + " day(s)");
    }
}