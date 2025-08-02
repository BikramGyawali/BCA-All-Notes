// Average of the Numbers of integers
#include<stdio.h>
main(){
	
	int i,sum=0,num;
	float avg;
	
	printf ("Enter the Numbers of Integers");
	scanf("%d",&num);
	int n[num];
//	printf("Enter %d integers:\n",num);
	for(i=0;i<=num;i++){
		printf("Enter the Number %d \n",i+1);
		scanf("&d",&n[i]);
		sum+=n[i];
	
	}
		avg=sum/num;
	printf("The average value of %d is %.2f",sum,avg);
	
}
