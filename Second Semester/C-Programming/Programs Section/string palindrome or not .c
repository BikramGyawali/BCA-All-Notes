//string palindrom or not

#include<stdio.h>
#include<string.h>
main(){
	char s[100];
	char r[100];
	printf("Enter the string \t");
	scanf("%s",s);
	strcpy(r,s);
	strrev(s);
	if(strcmp(s,r)==0){
		printf("\t%s is palindorme",r);
	}
	else{
		printf("\t%s is not palindrome",r);
	}
}


