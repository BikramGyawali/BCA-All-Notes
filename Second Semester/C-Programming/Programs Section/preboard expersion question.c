// expersion 7xroot(y^2+10)

#include<stdio.h>
#include<math.h>
void expression();
main(){
	expression();
}

void expression(){
	int x,y;
	float r;
	printf("Enter the value of x and y");
	scanf("%d%d",&x,&y);
	r=(7*x)*sqrt(y^2+10);
	printf("The result of the exresion is %f",r);
	
}
