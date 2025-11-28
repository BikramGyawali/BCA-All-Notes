#include<stdio.h>
#include<conio.h>
#include<math.h>
double a(double x) {
	return x*sin(x)+cos(x);
}
double b(double x){ 
return x*cos(x);
}
void main(){
	double x0,x1,e;
	int i,n;
	printf("Intial guessses (x0) :");
	scanf("%lf",&x0);
		printf("Error tolerance (E) :");
	scanf("%lf",&e);
	printf("Maximum Iteration (N) :");
	scanf("%d",&n);
	i=0;
	while(fabs(a(x0))>e){
		if(fabs(b(x0))<0.000005){
			printf("Error: First Derivative approx. zero!");
			return;
		}
		x1=x0-a(x0)/b(x0);
		x0=x1;
		i+=1;
		if(i>n){
			printf("Error: Not convergent !");
			return;
		}
	}
	printf("After %d iterations, Root =%f",i,x0);
	getch();
}
