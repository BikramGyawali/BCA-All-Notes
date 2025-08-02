//factorial recurcive
#include<stdio.h>
int fac(int);
main(){
	int n,r;
	printf("Enter the number");
	scanf("%d",&n);
	r=fac(n);
	printf("The factorial of %d is %d",n,r);
}

int fac(int n){
	int f;
	
	if(n==0)
	return 1;
	
	else 
	f= n*fac(n-1);
	return f;
}
