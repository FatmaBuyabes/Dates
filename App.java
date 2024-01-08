import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {

    public static void main(String[] args) {
        // Current date
        Date currentDate = new Date();

        Date date1 = new Date(2023); // 15th Feb 2023
        Date date2 = new Date(2024); // 20th Feb 2023

        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 14);
        Date futureDate = calendar.getTime();

        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 14 days: " + formattedFutureDate);
    }
}
