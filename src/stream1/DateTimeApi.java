package stream1;

public class DateTimeApi {
    public static void main(String[] args) {
        System.out.println("Date : " +java.time.LocalDate.now());
        System.out.println("Time : " +java.time.LocalTime.now());
        System.out.println("Date & Time : " +java.time.LocalDateTime.now());
    }
}
