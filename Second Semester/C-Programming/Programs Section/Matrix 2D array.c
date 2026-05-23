// Matrix in 2D array
#include<stdio.h>
main(){
	int i,j,m1[3][3],m2[3][3],s[3][3];
	printf("Enter the Element for first Matrix \n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",&m1[i][j]);
		}
	}
	printf("The first Matrix: \n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%d \t",m1[i][j]);
		}
		printf("\n");
	}
	printf("Enter the Element for second Matrix \n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",&m2[i][j]);
		}
	}
	
	printf("The Element of Second Matrix \n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%d \t",m2[i][j]);
		}
		printf("\n");
	}
	//start the sum section
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			s[i][j]=m1[i][j]+m2[i][j];
		}
	}
	
	printf("The sum of the matric:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%d \t",s[i][j]);
		}
		printf("\n");
	}
}
