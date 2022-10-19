import java.time.LocalDate;
import java.time.Period;

public class dates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("current date: " + now);
        LocalDate lab1 = LocalDate.of(2022, 9, 28);
        Period diff1 = lab1.until(now);
        System.out.println("period until due date: " + diff1);
        LocalDate lab2 = LocalDate.of(2022, 10, 26);
        Period diff2 = lab2.until(now);
        System.out.println("period until due date: " + diff2);
        LocalDate lab3 = LocalDate.of(2022,11, 23);
        Period diff3 = lab3.until(now);
        System.out.println("period until due date: " + diff3);
        LocalDate lab4 = LocalDate.of(2022, 12, 7);
        Period diff4 = lab4.until(now);
        System.out.println("period until due date: " + diff4);
    }
}
