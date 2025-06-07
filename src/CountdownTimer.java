
public class CountdownTimer {
    private int seconds;
    public CountdownTimer(int seconds){
        this.seconds = seconds;
    }
    // Function to handle countdown timer
    public void timer(){
        System.out.println("Countdown Timer started!");
        while (seconds>0) {
            System.out.print("\rTime Remaining: "+seconds+" seconds");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            seconds--;
        }
        System.out.println("\nTime's up!");
    }
}
