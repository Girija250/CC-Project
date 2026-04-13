#include <stdio.h>

#define MAX 100

int main() {
    int marks[MAX];
    int n = 0;   
    int choice, i;
    int entered = 0;  

    while (1) {
        printf("\n===== Student Management System =====\n");
        printf("1. Add Student Marks\n");
        printf("2. Display All Student Marks\n");
        printf("3. Calculate Average Marks\n");
        printf("4. Find Highest Marks\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter number of students (max 100): ");
                scanf("%d", &n);

                if (n <= 0 || n > MAX) {
                    printf("Invalid number of students.\n");
                    n = 0;
                    break;
                }

                for (i = 0; i < n; i++) {
                    printf("Enter marks of student %d: ", i + 1);
                    scanf("%d", &marks[i]);
                }

                entered = 1;
                printf("Student marks added successfully.\n");
                break;

            case 2:
                if (!entered) {
                    printf("No data available.\n");
                } else {
                    printf("Student Marks:\n");
                    for (i = 0; i < n; i++) {
                        printf("Student %d: %d\n", i + 1, marks[i]);
                    }
                }
                break;

            case 3:
                if (!entered) {
                    printf("No data available.\n");
                } else {
                    int sum = 0;
                    float average;

                    for (i = 0; i < n; i++) {
                        sum += marks[i];
                    }

                    average = (float)sum / n;
                    printf("Average Marks = %.2f\n", average);
                }
                break;

            case 4:
                if (!entered) {
                    printf("No data available.\n");
                } else {
                    int highest = marks[0];

                    for (i = 1; i < n; i++) {
                        if (marks[i] > highest) {
                            highest = marks[i];
                        }
                    }

                    printf("Highest Marks = %d\n", highest);
                }
                break;

            case 5:
                printf("Exiting program...\n");
                return 0;

            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
