#include<stdio.h>
main(){
	int i,n;
	printf("Enter the numbers:");
	scanf("%d",&n);
	int num[n];
	
	for (i=1;i<=n;i++){
		printf("Enter the %d number",i);
		scanf("%d",&num[i]);
		
	}
	
	int s=num[0],l=num[0];
	for (i=0;i<n;i++){
		
	
	if (num[i]<s){
		s=num[i];
	
	}
		if (num[i]>l){
		l=num[i];
	
	}
	}
		printf("th num is %d",s);
			printf("th num is %d",l);
}

