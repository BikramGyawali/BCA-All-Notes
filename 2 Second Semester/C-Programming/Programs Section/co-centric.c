// program to find the cube of a number
#include<stdio.h>
main(){
	float r1,r2,a1,a2,c;
	printf("Enter the radius of first circle:",r1);
	scanf("%f",&r1);
		printf("Enter the radius of second circle:",r2);
	scanf("%f",&r2);
	a1=3.14*(r1*r1);
	a2=3.14*(r2*r2);
	c=a1-a2;
	
	printf("the contentric %.2f",c);
}
