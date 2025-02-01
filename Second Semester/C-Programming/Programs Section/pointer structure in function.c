//structure with pointer function
#include <stdio.h>

struct student { // Define the structure
    int id;
    char n[40];
};

void display(struct student *s); // Function prototype

int main() {
    struct student st; // Create an instance of the structure

    printf("Enter the id: ");
    scanf("%d", &st.id);

    printf("Enter the name: ");
    scanf("%39s", st.n); // Safely read the name with a limit

    display(&st); // Pass the address of the structure to the function

    return 0;
}

void display(struct student *s) { // Function to display structure data
    printf("Name: %s\n", s->n);
    printf("ID: %d\n", s->id);
}

