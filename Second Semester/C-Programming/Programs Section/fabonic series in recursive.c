// fabonic series in recursive

#include<stdio.h>
int f(int);
main(){
	int i,n,r;
	printf("Enter the Number :");
	scanf("%d",&n);
	printf("The fabonic seires up to %d :\n",n);
	for(i=1;i<=n;i++){
		r=f(i);
		printf(" %d\t",r);
	}
}
 int f(int n){
 	if (n<=0)
 	return 0;


 	else if (n==1)
 	return 1;
 	else 
 	return (f(n-1)+f(n-2));
 }

