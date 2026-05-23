#include <stdio.h>
#include <string.h>
#include<conio.h>
int main() {
    int i, j, n;

    // Added space after "Enter the number of student"
    printf("Enter the number of students: ");
    scanf("%d", &n);

    // Declare the name array with fixed size (30 characters per name)
    char name[n][30], temp[30];
    
    // Input names of students
    for(i = 0; i < n; i++) {
        printf("Enter the name of student %d: ", i + 1);
        scanf("%s", name[i]);  // Read the name of each student
    }
    
    // Sorting the names in alphabetical order (Bubble sort)
    for(i = 0; i < n - 1; i++) {
        for(j = i + 1; j < n; j++) {
            // If name[i] > name[j], swap them
            if(strcmp(name[i], name[j]) > 0) {
                strcpy(temp, name[i]);
                strcpy(name[i], name[j]);
                strcpy(name[j], temp);
            }
        }
    }
    
    // Displaying sorted names in alphabetical order
    printf("\nNames in alphabetical order:\n");
    for(i = 0; i < n; i++) {
        // Print each name on a new line
        printf("%s\n", name[i]);
    }

    return 0;
}

