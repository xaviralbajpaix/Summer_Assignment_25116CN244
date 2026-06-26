import java.util.Scanner;

public class program104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is used to develop Android applications?",
                "2. Which keyword is used to inherit a class in Java?",
                "3. Which data structure follows FIFO?",
                "4. What is the size of an int data type in Java?",
                "5. Which company developed Java?"
        };

        String[][] options = {
                {"A. Python", "B. Java", "C. C", "D. HTML"},
                {"A. this", "B. implements", "C. extends", "D. super"},
                {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
                {"A. 2 Bytes", "B. 4 Bytes", "C. 8 Bytes", "D. 16 Bytes"},
                {"A. Google", "B. Oracle", "C. Microsoft", "D. Apple"}
        };

        char[] answers = {'B', 'C', 'B', 'B', 'B'};

        int score = 0;

        System.out.println("=======================================");
        System.out.println("      WELCOME TO QUIZ APPLICATION");
        System.out.println("=======================================");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("\nHello " + name + "!");
        System.out.println("Each correct answer carries 1 mark.");
        System.out.println("There are 5 questions.\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char choice = Character.toUpperCase(sc.next().charAt(0));

            if (choice == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i] + "\n");
            }
        }

        double percentage = (score / 5.0) * 100;

        System.out.println("=======================================");
        System.out.println("             QUIZ RESULT");
        System.out.println("=======================================");
        System.out.println("Candidate Name : " + name);
        System.out.println("Total Questions: 5");
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers  : " + (5 - score));
        System.out.println("Percentage     : " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Performance    : Excellent!");
        } else if (percentage >= 60) {
            System.out.println("Performance    : Good!");
        } else if (percentage >= 40) {
            System.out.println("Performance    : Average.");
        } else {
            System.out.println("Performance    : Needs Improvement.");
        }

        System.out.println("\nThank You For Playing the Quiz!");

        sc.close();
    }
}