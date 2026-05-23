// Average of 10 Numbers
#include<stdio.h>
main(){
	int i,n[10],sum=0;
	float avg;
   for (i=0;i<3;i++){
   	printf("Enter the Number %d:",i+1);
   	scanf("%d",&n[i]);
   	sum+=n[i];// sum = sum + n[i]
   	avg=sum/3;
   	
   }
   printf("The Average of the 3 integer is %.2f",avg);
}
