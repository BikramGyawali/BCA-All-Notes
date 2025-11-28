#include <stdio.h>
#include<conio.h>
#include<math.h>
double f(double x){
	return x*sin(x)+cos(x);
}
void main(){
	double a,b,e,c;;
	printf("Enter initial interval (a,b):");
	scanf("%lf%lf",&a,&b);
	printf("Enter error tolerance (E):");
	scanf("%lf",&e);
	if(f(a)*f(b)>0){
		printf("Error: No root in given interval !");
		return;
		
	}
	do{
		c=(a+b)/2;
		if(f(c)*f(a)>0)
		a=c;
		else
		b=c;
		
	}
	while(fabs(f(c)>e));
	printf("Root= %f",c);
	getch();
}
