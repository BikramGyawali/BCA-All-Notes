#include<stdio.h>
#include<math.h>
#define M 10
void main(){
	int n,i,j,k,maxitr=500;
	double A[M][M+1],x[M],z[M],d[M];
	double dmax, e= 0.00005;
	printf("How many Unknowns");
	scanf("%d",&n);
	printf("\n Enter the augmented co-eff. matrix : \n");
	for(i=0;i<n;i++){
		for(j=0;j<n+1;j++)
		scanf("%lf",&A[i][j]);
	}
	printf("\n Enter the initial guess to solution : \n");
	for(i=0;i<n;i++)
	scanf("%lf",&x[i]);
	k=0;
	do{
		k++;
	if(k>maxitr){
		printf("Error : No convergence in %d iterations!",maxitr);
		getch();
		return;
		
	}
	for(i=0;i<n;i++){
		z[i]=x[i];
		x[i]=A[i][n];
		for(j=0;j<n;j++)
		if(j!=i) x[i]=x[i]-A[i][j]*x[j];
		x[i]=x[i]/A[i][i];
		d[i]=fabs(z[i]-x[i]);
	}
	dmax=d[0];
	for(i=1;i<n;i++)
	if(d[i]>dmax)dmax=d[i];
	
	}while (dmax>e);
	printf("\n Solution:\n");
	for(i=0;i<n;i++)
	printf("%.4f \t",x[i]);
	getch();
}
