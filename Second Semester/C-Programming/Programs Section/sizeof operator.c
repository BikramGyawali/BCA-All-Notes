//Size of Operator
#include<stdio.h>
main(){
	int num;
	printf("Integer Occupies => %d bytes\n",sizeof(num));
	printf("Double Constant Occupies=> %d bytes\n",sizeof(16.18));
	printf("Long Int Data Type Qualifier Occupies=> %d bytes \n", sizeof(15L));
	printf("float Data Type Occupies => %d", sizeof(15.3f));
}
