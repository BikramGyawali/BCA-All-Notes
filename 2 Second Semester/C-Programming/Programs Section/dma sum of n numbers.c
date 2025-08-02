//using dma find the sum of n numbers
#include<stdio.h>
#include<stdlib.h>
main(){
	int n,*a,sum=0,i;
	printf("Enter the number of elements");
	scanf("%d",&n);
	a=(int*)malloc(n*sizeof(int));
	printf("Enter the numbers:");
	for(i=0;i<n;i++){
		scanf("%d",(a+i));
		sum=sum+*(a+i);
	}
	printf("sum of n number is %d",sum);
	free(a);
}
