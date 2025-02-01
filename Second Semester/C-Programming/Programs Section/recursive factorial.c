// factorial in recursive
#include<stdio.h>
long fact(int);
main(){
	int n;
	long r;
	printf("Enter the Number :");
	scanf("%d",&n);
	fact(n);
	r=fact(n);
	printf("The factorial of %d is %ld",n,r);
}

long  fact (int n){

if (n<=0)
return 1;
else
return (n*fact(n-1));
}
