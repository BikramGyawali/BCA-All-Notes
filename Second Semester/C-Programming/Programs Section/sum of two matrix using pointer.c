//add of m*n matrix using pointer

#include<stdio.h>
main(){
	int (*a)[3],(*b)[3],(*s)[3];
	int i,j;
	printf("Enter the element of first matrix\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",*(a+i)+j);
		}
		printf("\n");
	}
	
		printf("Enter the element of second matrix\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",*(b+i)+j);
		}
		printf("\n");
	}
	
	//sum
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			*(*(s+i)+j)=*(*(a+i)+j)+*(*(b+i)+j);
			printf("\t %d",*(*(s+i)+j));
		}
	}
}
