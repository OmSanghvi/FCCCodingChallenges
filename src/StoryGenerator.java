import java.util.Random;
import java.util.Scanner;

public class StoryGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] settings = {
                "a haunted castle",
                "a futuristic spaceship",
                "a mysterious underwater city",
                "a hidden island in the middle of the ocean",
                "an ancient temple buried deep in the jungle"
        };
        String[] events = {
                "discovers a magical artifact",
                "is chased by a terrifying creature",
                "unlocks a secret door to another dimension",
                "befriends a strange alien species",
                "stumbles upon an ancient curse"
        };
        String[] plotTwists = {
                "realizes they were dreaming all along",
                "uncovers a betrayal by a close ally",
                "finds out they have secret powers",
                "accidentally changes the course of history",
                "awakens a dormant, world-ending force"
        };
        String[] specialItems = {
                "a glowing crystal",
                "an ancient map",
                "a mysterious key",
                "a powerful sword",
                "a time-traveling device"
        };
        System.out.println("Enter the name of the main character: ");
        String mainCharacter = scanner.nextLine();

        System.out.println("Enter the name of the sidekick: ");
        String sidekick = scanner.nextLine();

        System.out.println("Enter the name of the villain: ");
        String villain = scanner.nextLine();
        String setting = settings[rand.nextInt(settings.length)];
        String event = events[rand.nextInt(events.length)];
        String plotTwist = plotTwists[rand.nextInt(plotTwists.length)];
        String specialItem = specialItems[rand.nextInt(specialItems.length)];
        String story = "In " + setting + ", " + mainCharacter + " and their trusty sidekick, " + sidekick +
                ", set out on an adventure. Along the way, they encounter " + villain +
                ", who is determined to stop them. \n\nDuring their journey, " + mainCharacter +
                " " + event + " and discovers " + specialItem + ", which holds great power. Just when things seem under control, " + plotTwist +
                ". \n\nNow, with everything at stake, " + mainCharacter +
                " and " + sidekick + " must make a choice that will change their lives forever.";
        System.out.println("\nHere's your epic story:\n");
        System.out.println(story);
        scanner.close();
    }
}
