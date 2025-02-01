// Program to calculate volume of a sphere
#include<stdio.h>
//#include <math.h>
main(){
	float r,v,pi;
	pi=3.14;
	printf("Enter the Radius:",r);
	scanf("%f",&r);
	v=(4.0/3.0)*pi*r*r*r;
	printf("The volume of a Sphere : %.2f",v);
	
}
