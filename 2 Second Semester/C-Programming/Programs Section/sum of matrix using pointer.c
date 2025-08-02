// add of matrix using using

#include<stdio.h>
#include<stdlib.h>
main(){
	int (*a)[3],(*b)[3],(*s)[3];
	int i,j;
	
	a=(int(*)[3])malloc(3*3*sizeof(int));
	b=(int(*)[3])malloc(3*3*sizeof(int));
	s=(int(*)[3])malloc(3*3*sizeof(int));
	printf("Enter the element of matrix\n");
	for(i=0;i<2;i++){
		for(j=0;j<3;j++){
			scanf("%d",*(a+i)+j);
		
		}
		printf("\n");
	}
	printf("Enter the elements of the second matrix\n");
		for(i=0;i<2;i++){
		for(j=0;j<3;j++){
				scanf("%d",*(b+i)+j);
		
		}
		printf("\n");
	}
	
	
	//for sum
		for(i=0;i<2;i++){
		for(j=0;j<3;j++){
			*(*(s+i)+j)=*(*(a+i)+j)+*(*(b+i)+j);
			printf("\t%d",*(*(s+i)+j));
		}
		printf("\n");
	}
	

}
