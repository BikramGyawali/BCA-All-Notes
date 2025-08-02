//data of 2 employe in structure and display them in
 ascending order base on the name  using
 pointer the employe detail contain id, name, address in c

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct employe {
    int id;
    char *name;
    char *add;
};

int main() {
    struct employe e[2];  // Array to store employee details
    int i, j, n = 2;
    
    // Allocate memory for name and address of each employee
    for(i = 0; i < n; i++) {
        e[i].name = (char*)malloc(10 * sizeof(char));  // Allocate memory for name
        e[i].add = (char*)malloc(10 * sizeof(char));   // Allocate memory for address
        
        // Entering the details
        printf("Enter the details of employee %d\n", i + 1);
        printf("Enter id, name, address: ");
        scanf("%d %s %s", &e[i].id, e[i].name, e[i].add);
    }
    
    // Sorting based on name in ascending order
    for(i = 0; i < n; i++) {
        for(j = i + 1; j < n; j++) {
            if(strcmp(e[i].name, e[j].name) > 0) {
                // Swap entire structures if names are in the wrong order
                struct employe temp = e[i];  // Temporary variable to hold the structure
                e[i] = e[j];  // Swap the structures
                e[j] = temp;  // Complete the swap
            }
        }
    }
    
    // Displaying sorted employee details
    printf("\nEmployee Details (Sorted by Name):\n");
    for(i = 0; i < n; i++) {
        printf("ID: %d, Name: %s, Address: %s\n", e[i].id, e[i].name, e[i].add);
    }
    
    // Free dynamically allocated memory
    for(i = 0; i < n; i++) {
        free(e[i].name);
        free(e[i].add);
    }

    return 0;
}

