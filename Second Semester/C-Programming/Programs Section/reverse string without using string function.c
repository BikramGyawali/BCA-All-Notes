//reverse string without using string function
#include<stdio.h>

main(){
	int i,l=0,j;
	char n[40];
	char rn[40];
	printf("Enter the string :");
	scanf("%s",n);
	while(n[l]!='\0'){
		l++;
	}
	for(i=0;i<l;i++){
		rn[i]=n[l-i-1];
		}
		rn[l]='\0';
		printf("%s",rn);
	}
	

