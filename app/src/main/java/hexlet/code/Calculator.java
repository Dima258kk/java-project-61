package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final Random random = new Random();

    public static char predicateoperat() {
        char[] operators = {'+', '-', '*'};
        int number = random.nextInt(3);
        return operators[number];
    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression? ");
        for (int i = 0; i < 3; i++) {
            int firstnumber = random.nextInt(20);
            int secondnumber = random.nextInt(20);
            char operation = predicateoperat();
            System.out.println("Question: " + firstnumber + " " + operation + " " + secondnumber);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            int correctAnswer =
                    switch (operation) {
                        case '+' -> firstnumber + secondnumber;
                        case '-' -> firstnumber - secondnumber;
                        case '*' -> firstnumber * secondnumber;
                        default -> 0;
                    };
            boolean isCorrect = correctAnswer == answer;
            if (isCorrect) {
                System.out.println("Correct!");

            } else {
                System.out.println(
                        answer
                                + " is wrong answer ;(. Correct answer was "
                                + correctAnswer
                                + ". "
                                + "Let's try again, Sam!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
