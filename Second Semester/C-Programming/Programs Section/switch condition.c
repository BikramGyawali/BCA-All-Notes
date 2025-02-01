//wap to use the switch
#include<stdio.h>
main(){
	int day;
	printf("Enter the days from 1 to 7 :");
	scanf("%d",&day);
	switch(day){
		case 1:
		printf("\n Sunday");
		break;
		case 2:
			printf("\n Monday");
			break;
			case 3:
				printf("\n Tuesday");
				break;
				case 4:
					printf("\n Wensday");
					break;
					case 5:
						printf("\n Thursday");
						break;
						case 6:
							printf("\n Friday");
							break;
							case 7:
								printf("\n Saturday");
								break;
								
								default:
									printf("\n Enter the valid date");
	}
}
