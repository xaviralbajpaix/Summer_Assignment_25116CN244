import java.util.Scanner;

class Marksheet {
    int rollNo;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double percentage;
    String grade;

    Marksheet(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("\n========== Marksheet ==========");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + m1);
        System.out.println("Subject 2  : " + m2);
        System.out.println("Subject 3  : " + m3);
        System.out.println("Subject 4  : " + m4);
        System.out.println("Subject 5  : " + m5);
        System.out.println("Total      : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}

public class program108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Marksheet Generation System =====");

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        int m5 = sc.nextInt();

        Marksheet student = new Marksheet(roll, name, m1, m2, m3, m4, m5);

        student.display();

        sc.close();
    }
}