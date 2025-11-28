#include<stdio.h>
#include<math.h>
double g(double x){ return (2-cos(x))/3;}
void main(){
	double x0,x1,e,error;
	int i, n;
printf("Intial guessses (x0) :");
	scanf("%lf",&x0);
		printf("Error tolerance (E) :");
	scanf("%lf",&e);
	printf("Maximum Iteration (N) :");
	scanf("%d",&n);
	i=0;
	do{
		x1=g(x0);
		error=fabs(x1-x0);
		x0=x1;
		i+=1;
		if(i>n){
			printf("Error: Not convergent !");
			return;
		}
	}	while(error>e);
		printf("After %d iteration, Root=%f",i,x0);
		getch();

}
