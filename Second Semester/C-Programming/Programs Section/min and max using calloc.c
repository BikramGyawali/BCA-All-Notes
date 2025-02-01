//finding the minimum and maximum using calloc
#include<stdio.h>
#include<stdlib.h>
main(){
	int n,*a,i,max,min;
	printf("Enter the numbers you want to store");
	scanf("%d",&n);
	printf("Enter the elements \n");
	a=(int*)calloc(n,sizeof(int));
	for(i=0;i<n;i++){
		scanf("%d",(a+i));
	}
	
	for(i=0;i<n;i++){
		max=*a;
	min=*a;
	
	if(max<*(a+i))
{
	max=*(a+i);
}
if(min>*(a+i)){
min=*(a+i);	
}

	}

printf("Max= %d",max);
printf("Min= %d",min);

free(a);
}

