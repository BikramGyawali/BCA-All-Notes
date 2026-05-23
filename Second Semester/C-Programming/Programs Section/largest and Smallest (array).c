// Smallest and Largest element in an array
#include<stdio.h>
main(){
	int i,n;
	printf("Enter the Number of Elemnts:"); //10
	scanf("%d",&n);
	int num[n];//num[10]
	for(i=0;i<n;i++){ //i=0;i<10;i++
		printf("Enter the number %d:",i+1);
		scanf("%d",&num[i]); //num[0],num[1],num[2]
		
	}
	int s=num[0],l=num[0]; 
	for(i=1;i<=n;i++){
		if(num[i]<s){//2<11
			s=num[i];
			// s=2
		}
		if(num[i]>l){ //22>2
			l=num[i];
			//l=22
		}
	}
	printf("The smallest Number in the given array is %d \n",s);
	printf("The Largest Number in the given array is %d",l);
}

