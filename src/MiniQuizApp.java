import java.util.Scanner;

public class MiniQuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the capital of India?\n(a) Chennai\n(b) New Delhi\n(c) Delhi",
                "Which planet has 146 moons?\n(a) Earth\n(b) Saturn\n(c) Jupiter",
                "What is the largest ocean on Earth?\n(a) Atlantic Ocean\n(b) Indian Ocean\n(c) Pacific Ocean"
        };
        char[] answers = {'b', 'b', 'c'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char answer = scanner.next().charAt(0);

            if (answer == answers[i]) {
                score++;
            }
        }

        System.out.println("Your score is: " + score + " out of " + questions.length);
        if (score == 3) {
            System.out.println("Excellent work!");
        } else if (score == 2) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
