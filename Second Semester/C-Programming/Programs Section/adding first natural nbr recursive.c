// Adding first naturral numbers in recursive

#include<stdio.h>
long sum(int);
main(){
	int i,n,r;
	printf("How many numbers :");
	scanf("%d",&n);
	r=sum(n);
	printf("The sum of first %d numbers is %ld",n,r);
}
long sum(int n){
	if (n==0)
	return 0;
	else 
	return (n+sum(n-1));
}
