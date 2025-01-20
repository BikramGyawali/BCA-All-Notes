// find sum of series upto n numbers
#include<stdio.h>
#include<math.h>
main(){
	int x,n,sum=0,i;
		printf("Enter the value of X and N:\n");
	scanf("%d%d",&x,&n);
	for(i=1;i<=n;i++){
		if(i%2==0){
			sum=sum-pow(x,i);
			
		}
		else{
			sum=sum+pow(x,i);
		}
	}
	printf("Sum =%d",sum);
	
} 
