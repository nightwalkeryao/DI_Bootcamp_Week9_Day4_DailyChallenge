import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    /*
     * Use the DateTimeFormatter for:
     * 1. Print the current date using LocalDate
     * 2. Print the current time using LocalDate
     * 3. Print the current time and date using LocalDateTime
     * 4. Print in a particular format “dd-MM-yyyy HH:mm:ss”
     * 5. Print months days and seconds
     * 6. Print some specified date “1950,1,26”
     * 7. Print date with current time.
     */
    public static void main(String[] args) {
        printCurrentDate();
        printCurrentTime();
        printCurrentDateTime();
        printFormattedDateTime();
        printMonthDaySecond();
        printSpecificDate();
        printCurrentDateTimeFormatted();
    }

    public static void printCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
    }

    public static void printCurrentTime() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current time: " + currentDate.atTime(0, 0));
    }

    public static void printCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
    }

    public static void printFormattedDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }

    public static void printMonthDaySecond() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int month = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int second = currentDateTime.getSecond();
        System.out.println("Month: " + month + ", Day: " + day + ", Second: " + second);
    }

    public static void printSpecificDate() {
        LocalDate specificDate = LocalDate.of(1950, 1, 26);
        System.out.println("Specific date: " + specificDate);
    }

    public static void printCurrentDateTimeFormatted() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current date and time formatted: " + formattedDateTime);
    }
}
