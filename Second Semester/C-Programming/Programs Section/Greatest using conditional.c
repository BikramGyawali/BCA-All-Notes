// Program to use the greatest among two numbers using conditional operator
#include<stdio.h>

main(){
	int a,b,l;
	printf("Enter  The First Numbers :");
	scanf("%d",&a);
	printf("Enter  The Second Numbers :");
	scanf("%d",&b);
	l=(a>b)?a:b;
	printf("The Largest Number is %d\n",l);
}
