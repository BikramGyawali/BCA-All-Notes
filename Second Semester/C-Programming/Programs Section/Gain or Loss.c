// Program of Gain or loss
#include<stdio.h>
main(){
	int cp,sp,d,l;
	printf("Enter the Cost Price:");
	scanf("%d",&cp);
	printf("Enter the Selling Price :");
	scanf("%d",&sp);
	
	if(sp>cp){
		d=sp-cp;
		printf("You gain amount Rs %d",d);
	
	}
	else{
		l=cp-sp;
		printf("You are in loss Rs %d",l);
	}
}

