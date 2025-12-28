#include<stdio.h>
#include<math.h>
double f(double x){
	return 3*x*sin(x)+cos(x);
}
void main(){
	double a,b,h,x,sum;
	int i,n,m;
	printf("Enter the limits of integration (a,b):");
	scanf("%lf%lf",&a,&b);
	printf("How many sub-intervals?");
	scanf("%d",&n);
	if(n%3!=0){
		printf("N should be a multiple of 3");
		getch();
		return;
	}
	h=(b-a)/n;
	sum=f(a)+f(b);
	for(i=1;i<n;i++){
		m=(i%3==0)?2:3;
		x=a+i*h;
		sum=sum+m*f(x);
	}
	sum=sum*3*h/8;
	printf("\n Solution: %f",sum);
}
