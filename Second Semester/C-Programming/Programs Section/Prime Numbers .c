// finding the given number is prime or not
 
 #include<stdio.h>
 main(){
 	int n,count=1,i;
 	printf("Enter the Number :");
 	scanf("%d",&n);
 	for(i=2;i<n;i++){
 		if(n%i==0){
 			count=0;
		 }
	}
		(count==1)?printf("%d is Prime Number ",n):printf("%d is not Prime Number",n);
		 
	 
 }
