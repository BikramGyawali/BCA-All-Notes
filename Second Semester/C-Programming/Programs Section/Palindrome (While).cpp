// Program for palindrome Number
#include<stdio.h>
main(){
	int n,rev=0,rem,org; //rev=reverse,rem=reminder,org=original
	printf("Enter the Number:");
	scanf("%d",&n);
	org=n;
	while(n!=0){
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	/*
	
	Using conditional statment
	if(org==rev){
		printf(" %d is Palindrome",org);
	}
	else{
		printf("%d is not Palindrome",org);
}
*/

(org==rev)?printf(" %d is Palindrome",org):
printf("%d is not Palindrome",org);
}
