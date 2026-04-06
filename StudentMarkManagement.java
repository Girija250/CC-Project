import java.util.Scanner;

public class StudentMarkManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int choice;
        boolean entered = false;

        do {
            System.out.println("\n===== Student Marks Management System =====");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Find Total Marks");
            System.out.println("4. Find Average Marks");
            System.out.println("5. Find Highest Mark");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter marks for 5 students:");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    entered = true;
                    break;
                case 2:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        System.out.println("Student Marks:");
                        for (int i = 0; i < marks.length; i++) {
                            System.out.println("Student " + (i + 1) + ": " + marks[i]);
                        }
                    }
                    break;
                case 3:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < marks.length; i++) {
                            total += marks[i];
                        }
                        System.out.println("Total Marks = " + total);
                    }
                    break;
                case 4:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < marks.length; i++) {
                            total += marks[i];
                        }
                        double average = (double) total / marks.length;
                        System.out.println("Average Marks = " + average);
                    }
                    break;
                case 5:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int highest = marks[0];
                        for (int i = 1; i < marks.length; i++) {
                            if (marks[i] > highest) {
                                highest = marks[i];
                            }
                        }
                        System.out.println("Highest Mark = " + highest);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}