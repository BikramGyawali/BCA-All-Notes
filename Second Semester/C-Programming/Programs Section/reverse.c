//program to find the reverse of the given numers
#include<stdio.h>
main (){
	int n,rev=0,r;
	printf("Enter the number :");
	scanf("%d",&n);
	while(n>0){
		r=n%10;
		rev=rev*10+r;
		n/=10;
		
	}
	printf("The reverse of %d is %d",n,rev);
}
