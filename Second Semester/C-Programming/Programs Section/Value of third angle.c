// Program to calculate third angle
#include<stdio.h>

main(){
	int a,b,c,t;
	t=180;//t means total area of a triangle 
	
	printf("Enter the First Angle : ",a);
	scanf("%d",&a);
		printf("Enter the Second Angle : ",b);
	scanf("%d",&b);
	c=t-(a+b); // 180- (a+b)
	printf("Value of Third Angle : %d",c);
	
}
