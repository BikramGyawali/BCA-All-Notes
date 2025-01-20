// program to get information of 5 students using struct

#include<stdio.h>
struct student{
	int r;
	char n[50] ,a[30];	
};
main(){
	struct student s[5];
	int i;
	for(i=0;i<5;i++){
		printf("Enter the Rool No:");
	scanf("%d",&s[i].r);
	printf("Enter te Name: ");
	scanf("%s",s[i].n);
	printf("Enter the Address:");
	scanf("%s",s[i].a);
	}
	
	
	printf("\nData of the 5 students\n");
	for(i=0;i<5;i++){
		printf("\nRoll No:%d\n",s[i].r);
		printf("Name :%s\n",s[i].n);
		printf("Address :%s \n",s[i].a);
	}
	printf("\n");
}
