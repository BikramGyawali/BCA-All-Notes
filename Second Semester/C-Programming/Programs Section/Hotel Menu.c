// using Switch condition for menu of a hotel

#include<stdio.h>
main(){
int n ,i;
printf("\n\n %30s Welcome to Hotel Coders Club\n\n Here the Menu with Items Numbers:\n\n","");
printf("1) Momo \n");
printf("2) Noodles \n");
printf("3) Pizza \n");
printf("4) Burger \n");
printf("5) Samosa \n");
printf("\nEnter the Item Number of food from 1 to 5 :\t");
scanf("%d",&n);
	switch(n){
		case 1:
		printf("Your order is Momo");
		break;
		case 2:
			printf("Your order is Noddles");
			break ;
			case 3:
				printf("Your order is Pizza");
				break;
			case 4:
			printf("Your order is Burger");
			break;
			case 5:
			printf("Your order is Samosa");
			break;
			default:
			printf("Please Enter the item which is present in the menu");	
		
	}
}
