// Calculating the factorial of a number 
#include<stdio.h>
main(){
	int i=1,n,factorial=1;
	printf("Enter a Number :");
	scanf("%d",&n);
	while(i<=n){
		
		factorial*=i;
			i++;
	
		
	}
	printf("The factorial of %d is %d",n,factorial);
}
