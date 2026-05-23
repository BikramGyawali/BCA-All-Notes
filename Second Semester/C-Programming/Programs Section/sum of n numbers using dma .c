//sum of n numbers using dma 
#include<stdio.h>
#include<stdlib.h>
main(){
	int n,*a,i,sum=0;
	printf("Enter the number of element");
	scanf("%d",&n);
	
	a=(int*)malloc(n*sizeof(int));
	printf("Enter the numbers:");
	for(i=0;i<n;i++){
		scanf("%d",(a+i));
		sum+=*(a+i);
		
	}
	printf("The sum is %d ",sum);
	free(a);
}
