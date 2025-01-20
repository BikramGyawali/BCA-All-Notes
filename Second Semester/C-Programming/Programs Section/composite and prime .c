// to find the composite and prime number

#include<stdio.h>
main(){
	int i,n,r=1;
	printf("Enter the number:");
	scanf("%d",&n);
	if(n<=1){
		printf("The number is neither prime nor composite");
	}
	for(i=2;i<n;i++){
		if(n%i==0){
			r=0;
			break;	
		}
	}
	(r)?printf("%d is prime numbers",n):printf("%d is composite numbers",n);
}
