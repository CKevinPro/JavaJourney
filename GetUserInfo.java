// Chard Kevin H. Estinopo - BSIT-1A

import java.util.Scanner;

public class GetUserInfo {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = inputDevice.nextLine();

        System.out.println("Welcome to Java, " + name + "!");

        System.out.print("Would you like to continue? (yes/no): ");
        String choice = inputDevice.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Please enter your age: ");
            int age = inputDevice.nextInt();
            inputDevice.nextLine(); // Consume newline

            if (age >= 18) {
                System.out.println("What would you like to do, " + name + "?");
                System.out.println("Option 1: Calculate Grades");
                System.out.println("Option 2: In progress");
                System.out.println("Option 3: In progress");
                System.out.println("Option 4: In progress");
                System.out.print("Option: ");

                int ans = inputDevice.nextInt();

                while (ans < 1 || ans > 4) {
                    System.out.println("Invalid input. Please choose 1, 2, 3, or 4 only.");
                    System.out.print("Option: ");
                    ans = inputDevice.nextInt();
                }

                switch (ans) {
                    case 1:
                        System.out.println("Please enter your scores out of 100");

                        System.out.print("Assignment: ");
                        double assignment = inputDevice.nextDouble();

                        System.out.print("Quiz: ");
                        double quiz = inputDevice.nextDouble();

                        System.out.print("Lab: ");
                        double lab = inputDevice.nextDouble();

                        System.out.print("Midterm Exam: ");
                        double midterm = inputDevice.nextDouble();

                        double finalGrade = (assignment * 0.15) + (quiz * 0.20) + (lab * 0.30) + (midterm * 0.35);

                        System.out.printf("Your final grade is: %.2f%n", finalGrade);

                        if (finalGrade >= 75) {
                            System.out.println("Congratulations, you passed!");
                        } else {
                            System.out.println("Sorry, you failed.");
                        }
                        break;

                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Nothing to see here.");
                        break;
                }
            } else {
                System.out.println("You are underage. Please exit the program.");
            }

            System.out.println("Program exited. Goodbye!");
        }

        inputDevice.close();
    }
}
