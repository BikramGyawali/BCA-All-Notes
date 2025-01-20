//display the highest mask among the studetns

#include<stdio.h>
struct student{
	int id;
	float marks;
//	float g;
};
main(){
	struct student s[10];
	int i;
	float g;
	printf("\n Getting the data from users:\n\n");
	for(i=0;i<3;i++){
		printf("Enter the roll no of %d student :",i+1);
		scanf("%d",&s[i].id);
		printf("Enter the marks of the stuent %d :",i+1);
		scanf("%f",&s[i].marks);
	}
	
	printf("\nDisplying the Input of the students:\n");
	
	for(i=0;i<3;i++){
		printf("rool no :%d\t",s[i].id);
		printf("Marks :%f\t",s[i].marks);
	}
	
	printf("\nFor showing the highest marks:\n");
	
	g=s[0].marks;
	for(i=0;i<3;i++){
	if(g<s[i].marks){
	g=s[i].marks;
		
	}
}
printf("\nHighest marks : %f",g);

}
