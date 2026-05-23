// program to find the 1+x^2+3x^2+4x^2.....+nx^2
#include<stdio.h>
main()
{
	int i ,n,s,x;
	printf("Enter the value of X and N:\n");
	scanf("%d%d",&x,&n);
	s=1+x*x;
	for(i=3;i<=n;i=i+1){
	s=s+i*x*x;	
	}
		
	printf("The Sum=%d",s);
}
