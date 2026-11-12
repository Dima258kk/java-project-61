package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Game_even {

    public static boolean predicateSumm(int n) {
        return n % 2 == 0;
    }

    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'. ");
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(20);
            System.out.println("Question:" + number);
            String answer = scanner.nextLine();

            boolean correct = predicateSumm(number) == answer.equals("yes");

            if (correct) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = predicateSumm(number) ? "yes": "no";

                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
