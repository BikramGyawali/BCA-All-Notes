#include<stdio.h>
#include<math.h>
void main(){
	double sumx,sumx2,sumy,sumxy;
	double x,y,a,b;
	double d1,d2,d3;
	int i, j, n;
	printf("Number of data ");
	scanf("%d",&n);
	sumx=0;sumx2=0;sumy=0;sumxy=0;
	printf("Enter %d data pairs (x,y) : \n",n);
	for(i=0;i<n;i++){
		scanf("%lf%lf",&x,&y);
		sumx+=x;
		sumx2+=x*x;
		sumy+=log(y);
		sumxy+=x*log(y);
	}
	d1= (sumy*sumx2-sumxy*sumx);
	d2=(n*sumxy-sumx*sumy);
	d3=(n*sumx2-sumx*sumx);
	a=exp(d1/d3);
	b=d2/d3;
	printf("\Required equation is :\n");

	printf("y= %.3f e^(%.3fx) ",a,(b));

}
