#include <stdio.h>
#include <conio.h>
#include <math.h>
#define MAX 10
void main(){
	int n ,i ,j,k;
	double A[MAX][MAX+1],X[MAX];
	double ratio;
	printf("How Many Unknowns ?");
	scanf("%d",&n);
	printf("\n Enter the augmented co-eff. matrix: \n");
	for(i=0;i<n;i++)
		for(j=0;j<n+1;j++)
			scanf("%lf",&A[i][j]);
			for(j=0;j<n-1;j++){
				if (fabs(A[j][j])<0.00005){
					printf("\n Error : Pivot element approx. zero!");
					getch();
					return;
				}
				
				for(i=j+1;i<n;i++){
					ratio=A[i][j]/A[j][j];
					for(k=j; k<=n;k++){
					A[i][k]	= A[i][k] - ratio * A[j][k];
					}
				}
			}
			for(i=n-1; i>=0 ;i--)
			{
				X[i]= A[i][n];
				 for(j=i+1; j<n; j++)
				  X[i] = X[i] - A[i][j]*X[j];
				  X[i] = X[i] / A[i][i];
			}
			printf("\n Solution: ");
			 for(i=0; i<n; i++)
			 	printf("\n%.4f", X[i]);
			 getch();
			 }
	

