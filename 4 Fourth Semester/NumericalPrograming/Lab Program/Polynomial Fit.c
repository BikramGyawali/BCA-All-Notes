#include <stdio.h>
#include <math.h>
#define m 100
void main(){
	double x[m],y[m],a[9][10],c[9],r;
	int i,j,k,n,d;
	printf("Enter no of data paris :");
	scanf("%d",&n);
	printf("Enter degree of polynomail :");
	scanf("%d",&d);
	printf("Enter the data pairs(x,y): \n");
	for(k=0;k<n;k++)
			scanf("%lf%lf",&x[k],&y[k]);
			
	for(i=0;i<=d;i++){
		for(j=0;j<=d;j++){
			a[i][j]=0;
					for(k=0;k<n;k++)
					a[i][j]+=pow(x[k],i+j);
				}
				a[i][d+1]=0;
				for(k=0;k<n;k++)
				a[i][d+1]+=pow(x[k],i)*y[k];
			}
			for(j=0;j<d;j++){
				for(i=0;i<=d;i++){
					if(i!=j){
						r=a[i][j]/a[j][j];
						for(k=0;k<=d+1;k++)
						a[i][k]-=r*a[j][k];
					}
				}
			}
			for(i=0;i<=d;i++)
			c[i]=a[i][d+1]/a[i][i];
			printf("\n Solution :");
			printf("\n Intercept = %12.4f",c[0]);
			printf("\n Coefficients :");
			for(i=1;i<=d;i++)
			printf("\n x^%d => %12.4f",i,c[i]);
			getch();
			
	
}
