import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    private  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

    public void clock(){
        // Infinite loop to display time
        while (true) {
            // Get current time in HH:MM:SS format
            LocalTime currentTime = LocalTime.now();
            System.out.print("\rDigital Clock: " + currentTime.format(formatter));
            try {
                // Pause for 1 second
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
