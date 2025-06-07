import java.util.Scanner;

public class UserChoice {
    static void userChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an Option:");
        System.out.println("1. Digital Clock\n2. Countdown Timer");
        System.out.print("Your Choice : ");
        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                DigitalClock dClock = new DigitalClock();
                dClock.clock();
                break;
            case 2:
                System.out.print("Enter the number of seconds to countdown: ");
                int sec = scan.nextInt();
                CountdownTimer cTimer = new CountdownTimer(sec);
                cTimer.timer();
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        scan.close();
    }
}
