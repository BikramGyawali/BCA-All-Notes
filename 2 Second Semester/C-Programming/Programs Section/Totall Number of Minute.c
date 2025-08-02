// Program to calculate total number of minute
#include<stdio.h>

main(){
	int h,c,m;
	
	printf("Enter the hours  :",h);
	scanf("%d",&h);
		printf("Enter the Minute :",m);
	scanf("%d",&m);
	c=(h*60)+m;
	printf("Total Number of Minute : %d",c);
	
}
