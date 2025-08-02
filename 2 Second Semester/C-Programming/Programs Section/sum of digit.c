//program to find the sum of digit of a number
#include<stdio.h>
main(){
	int i,rem,rev=0,n,sum=0;
	printf("Enter the number:");
	scanf("%d",&n);
	while(n!=0){
		rem=n%10;
		n/=10;
		sum+=rem;
	}
	printf("The sum of digit is %d",sum);
}
