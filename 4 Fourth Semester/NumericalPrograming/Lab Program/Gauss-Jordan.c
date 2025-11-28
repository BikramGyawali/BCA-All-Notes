#include<stdio.h>
#include<math.h>
#define MAX 10
void main(){
	int n,i,j,k;
	double a[MAX][MAX+1],x[MAX];
	double ratio;
	printf("How many unknowns? ");
	scanf("%d",&n);
	printf("\n Enter the augmented co-eff. matrix: \n");
	for(i=0;i<n;i++)
	for(j=0;j<n+1;j++)
	scanf("%lf",&a[i][j]);
	for(j=0;j<n;j++){
		if(fabs(a[i][j]<0.000005)){
			printf("\n Error: Pivot element approx. zero!");
			getch();
			return;
		}
		for(i=0;i<n;i++){
			if(i!=j){
				ratio=a[i][j]/a[j][j];
				for(k=j;k<=n;k++){
					a[i][k]=a[i][k]-ratio*a[j][k];
				}
			}
		}
	}
	for(i=0;i<n;i++)
	x[i]=a[i][n]/a[i][i];
	printf("\n Solution: \n");
	for(i=0;i<n;i++)
	printf(".%4f ",x[i]);
	getch();
	
}
