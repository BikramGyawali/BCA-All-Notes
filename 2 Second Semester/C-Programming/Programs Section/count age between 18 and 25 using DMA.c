// using dma entering the age of 20 students and and finding the number of students between 18 and 25
#include<stdio.h>
#include<stdlib.h>
main(){
	int n,c=0,i;
	int *a;
	a=(int *)malloc(5*sizeof(int));
	printf("Enter %d integer",n+1);
	for(i=0;i<5;i++){
		scanf("%d",a+i);
		if(*(a+i)>18&&*(a+i)<25){
			c++;	
		}
	
	}
	printf("The number of student having age between 18 and 25 is %d",c);
	free(a);
}
