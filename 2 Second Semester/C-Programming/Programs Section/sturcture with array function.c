
// structure with array function
#include <stdio.h>

struct student { 
    int id;
    char n[40];
};

void display(struct student []); 
int i;

int main() {
	
    struct student st[2];

   for(i=0;i<2;i++){
   	 printf("Enter the id: ");
    scanf("%d", &st[i].id);

    printf("Enter the name: ");
    scanf("%39s", st[i].n); 

   }
    display(st); 

    return 0;
}

void display(struct student s[]) { 
    for(i=0;i<2;i++){
    	printf("Name: %s\n", s[i].n);
    printf("ID: %d\n", s[i].id);
	}
}

