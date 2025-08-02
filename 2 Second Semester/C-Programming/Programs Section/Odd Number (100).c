// To find the even number from 0 to 100
#include<stdio.h>
main(){
int i,r;
for(i=0;i<=100;i++){
	r=(i%2==0)?printf("%d \n",i):printf("");
}
}
