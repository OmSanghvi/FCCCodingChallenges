import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your event: ");
        String eventName = scanner.nextLine();
        System.out.print("Enter the time remaining until the event (in seconds): ");
        int initialTime = scanner.nextInt();
        startCountdown(eventName, initialTime);
    }

    private static void startCountdown(String eventName, int timeRemaining) {
        Timer timer = new Timer();
        AtomicInteger remainingTime = new AtomicInteger(timeRemaining);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int currentTime = remainingTime.get();
                if (currentTime > 0) {
                    System.out.println("Time remaining until " + eventName + ": " + currentTime + " seconds.");
                    remainingTime.decrementAndGet();
                } else {
                    System.out.println("🎉 Time's up! Enjoy your " + eventName + "!");
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }
}
