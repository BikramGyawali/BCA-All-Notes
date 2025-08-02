// for finding sum of the sequence 1/1!+2/2!+3/3!.......n/n!
#include<stdio.h>
main(){
	int i,j,n,f;
	float sum=0;
	printf("Enter the Number:");
	scanf("%d",&n);
	for (i=0;i<=n;i++){
		f=1;
		for(j=1;j<=i;j++)
			f=f*j;	
		
		
			sum=sum+(float)i/f;
		
	}
	printf("Sum =%f",sum);
}
