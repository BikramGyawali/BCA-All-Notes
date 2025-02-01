//swap number using pointer
#include<stdio.h>
main(){
	int *a,*b,*t;
	int c,d;
	printf("Enter any two numbers :");
	scanf("%d%d",&c,&d);
	a=&c;
	b=&d;
	printf("Numbers before swap a=%d and b=%d\n\n",*a,*b);
	//now swapping the value
	
	t=a;
	a=b;
	b=t;
	printf("Number after swap a= %d and b=%d",*a,*b);
}
