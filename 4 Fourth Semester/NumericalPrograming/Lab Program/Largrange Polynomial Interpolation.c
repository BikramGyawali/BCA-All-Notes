#include <stdio.h>
#include <math.h>
#define M 100
void main(){
	double X[M],Y[M],x,y,p;
	int i,j,n;
	printf("How many data pairs ?");
	scanf("%d",&n);
	printf("\n Enter %d data pairs (xi,yi): \n",n);
	for(i=0;i<n;i++)
	scanf("%lf%lf",&X[i],&Y[i]);
	printf("\n Enter the value of interpolant(x):");
	scanf("%lf",&x);
	y=0;
	for(i=0;i<n;i++){
		p=1;
		for(j=0;j<n;j++){
			if(i!=j) p=p*(x-X[j])/(X[i]-X[j]);
		}
		y=y+p*Y[i];
	}
	printf("\n Result : y(%g)=%g",x,y);
	getch();
}
