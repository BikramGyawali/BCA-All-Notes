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
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(num[i]>num[j]){
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
	printf("The ascending order of the given numbers : ");
	for(i=0;i<n;i++){
	printf("\n%d",num[i]);
	}

}
