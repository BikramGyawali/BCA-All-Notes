// Program to calculate kilometer per hour to miles per hour
#include<stdio.h>

main(){
	float kph,c,mph;
	c=0.62137119;
	printf("Enter the Kilometer per hours:",kph);
	scanf("%f",&kph);	
	mph=kph*c;
	printf("Miles per hour : %.2f",mph);
	
}
