// to store the odd number in odd file and even number in the even file and read the number of odd file 

#include<stdio.h>
main(){
	FILE *of,*ef;
	int i,num,n;
	printf("Enter the numbers of elemts you want to store");
	scanf("%d",&num);
	of=fopen("odd.txt","a");
	ef=fopen("even.txt","a");
	for(i=0;i<num;i++){
		printf("Enter the %d number:",i+1);
		scanf("%d",&n);
			if(n%2==0){
		fwrite(&n,sizeof(int),1,ef);
	}
	else(
	fwrite(&n,sizeof(int),1,of));
	
	
	}
	fclose(of);
	fclose(ef);

	//for reading the even numbers 
	
	of=fopen("odd.txt","r");
	while(	fread(&n,sizeof(int),1,of)==1)
	printf("%d \n",n);
fclose(of);
	}
	
