package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n" + "1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        Scanner scannerChoice = new Scanner(System.in);
        int number = scannerChoice.nextInt();
        if (number == 2) {
            System.out.println("Welcome to the Brain Games!");
            Game_even.even();
        }
    }
}