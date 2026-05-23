//ascending using bubble shoot
// program for ascending the numbers
#include<stdio.h>
main(){
	int temp,j,i,n;
	printf("Enter the Number you wants to make in the ascending order:\t");
	scanf("%d",&n);
	int num[n];
	for(i=0;i<n;i++){
		printf("Enter the %d Number:",i+1);
		scanf("%d",&num[i]);
	}
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(num[j]>num[j+1]){
				temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}
		}
	}
	printf("The ascending order of the given numbers : ");
	for(j=0;j<n;j++){
	printf("\n%d",num[j]);
	}

}
