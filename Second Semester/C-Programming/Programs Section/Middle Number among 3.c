// finding middle number among 3 numbers using 
#include<stdio.h>
main(){
	int a, b, c;
    printf("Enter the first number: ");
    scanf("%d", &a);
    printf("Enter the second number: ");
    scanf("%d", &b);
    printf("Enter the third number: ");
    scanf("%d", &c);
  if((a>b&&a<c)||(a>c&&a<b)){
  	printf ("The Middle Value is %d",a);
  }
  else if((b>a&&b<c)||(b>c&&b<c)){
  	printf("The middle Value is %d",b);
  }
  else{
  	printf("The middle Value is %d",c);
  }
}
