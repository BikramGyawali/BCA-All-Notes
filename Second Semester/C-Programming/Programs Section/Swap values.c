//Swap  two Values without using third variable
#include<stdio.h>
main(){
	int n1,n2;
	printf("Enter the First Number:");
	scanf("%d",&n1);
	printf("Enter the Second Number:");
	scanf("%d",&n2);
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	printf("After Swapping n1=%d and n2=%d \n",n1,n2);
}
