// to copy write the contant in one file and copying to another

#include<stdio.h>
main(){
	FILE *sfp,*dfp;
	char n[100],dn[100];
	
	sfp=fopen("Source.txt","w");
	if(sfp==NULL){
		printf("Error in opening file");
		return ;
	}
	printf("Enter the string");
	fgets(n,sizeof(n),stdin);
	fputs(n,sfp);
	fclose(sfp);
	
	sfp=fopen("Source.txt","r");
	dfp=fopen("Destination.txt","w");
while(fgets(n,sizeof(n),sfp)){
	fputs(n,dfp);
}
	fclose(sfp);
	fclose(dfp);
	
	dfp=fopen("Destination.txt","r");
	while(fgets(n,sizeof(n),dfp)){
		printf(" the contant in the file destination %s",n);
	}
}
