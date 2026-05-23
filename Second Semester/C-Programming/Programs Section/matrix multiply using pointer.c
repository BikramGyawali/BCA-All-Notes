//matrix multiply by taking the number of row and column by user  using pointer 

#include<stdio.h>
main(){
	int a[4][4],b[4][4],s[4][4];
	int ar,ac,br,bc,i,j,k;
	printf("Enter the number of row and column (less than 4) for first matrix\n");
	scanf("%d%d",&ar,&ac);
	printf("Enter the number of row and column (less than 4) for second matrix \n");
	scanf("%d%d",&br,&bc);
	if(ac!=br){
		printf("This cannot multiply");
		return ;
	}
	
	printf("Enter the element for first matrix \n");
	for(i=0;i<ar;i++){
		for(j=0;j<ac;j++){
			scanf("%d",*(a+i)+j);
		}
		printf("\n");
	}
	
		printf("Enter the element for Second matrix \n");
	for(i=0;i<br;i++){
		for(j=0;j<bc;j++){
			scanf("%d",*(b+i)+j);
		}
			printf("\n");
	}
	
	//for multiply
	
	for(i=0;i<ar;i++){
		for(j=0;j<bc;j++){
			*(*(s+i)+j)=0;
			for(k=0;k<ac;k++){
				*(*(s+i)+j)+=*(*(a+i)+k)* *(*(b+k)+j);
			}
			printf("%d \t",*(*(s+i)+j));
		}
		printf("\n");
		}
		

	

}
