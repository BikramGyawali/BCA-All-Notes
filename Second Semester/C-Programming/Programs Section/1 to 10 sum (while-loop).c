//Added Number from 1 to 10 using while-loop
#include<stdio.h>
main(){
	int i=0,sum=0;
	while(i<=10){
		sum+=i;
		i++;
	}
	printf("Sum of Numbers : %d",sum);
}
