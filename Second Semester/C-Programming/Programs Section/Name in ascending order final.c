#include<stdio.h>
#include<conio.h>
#include<string.h>
main(){
	char name[4][30],temp[30]; 
	//charn[4][30] in this 4 means student and 30 means 1 student can hold 30 charcter
	int i,j;
	printf("Enter the name of 4 students");
	for(i=0;i<4;i++){
		scanf("%s",name[i]);
	}
	for(i=0;i<4;i++){
		for(j=i+1;j<4;j++){
			 if(strcmp(name[i], name[j]) > 0) {
                strcpy(temp, name[i]);
                strcpy(name[i], name[j]);
                strcpy(name[j], temp);
            }
		}
	}
	 printf("\nNames in alphabetical order:\n");
    for(i = 0; i < 4; i++) {
    
        printf("%s\n", name[i]);
    }
}
