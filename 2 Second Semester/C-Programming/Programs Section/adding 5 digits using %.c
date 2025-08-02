//Wap to sum the digits of postive integer which is 5 digit long
#include<stdio.h>
#include<conio.h>
main(){
	int num,n,digit1,digit2,digit3,digit4,digit5,sum;
	printf("Enter a five digit integer:");
	scanf("%d",&num );
	n=num;
	digit1=n%10;
	n=n/10;
	
	digit2=n%10;
		n=n/10;
		digit3=n%10;
			n=n/10;
			digit4=n%10;
				n=n/10;
				digit5=n%10;
					n=n/10;
					sum=digit1+digit2+digit3+digit4+digit5;
					printf(" Sum =%d",sum);
}
