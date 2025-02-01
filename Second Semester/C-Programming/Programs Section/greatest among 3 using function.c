//Program to find the greatest number among three numbers
#include<stdio.h>
main()
{
	int a,b,c,d,result;

		printf("\n Enter any three number: ");
		scanf("%d%d%d",&a,&b,&c);
       d=greatest(a,b);
       result=greatest(d,c);
printf("\n The greatest number : %d",result);
	
}
greatest(x,y){

 if(x>y)
 	return x;
 
 else 
 return y;	
 
 
}
