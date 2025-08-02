//add data in a file 

#include<stdio.h>
#include<string.h>
struct student{
	int id;
	char n[40];
	
};


main(){
	struct student s;
	int n;
	int i;
	FILE *fp;
	printf("Enter the number of student you want to add record of : ");
	scanf("%d",&n);
	fp=fopen("student.txt","ab");
	for(i=0;i<n;i++){
		printf("Enter the data of %d student",i+1);
		printf("Enter the id \n");
		scanf("%d",&s.id);
		printf("Enter Name: ");
        scanf("%39s", s.n);
		fwrite(&s,sizeof(struct student),1,fp);
	}
	fclose(fp);
	
	fp=fopen("student.txt","rb");
i=0;
		while(fread(&s,sizeof(struct student),1,fp)==1){
		printf("Name=%s \n id=%d",s.n,s.id);
	i++;
	}
	
	fclose(fp);
}
