//add data of student in a file

#include<stdio.h>
#include<string.h>
struct student{
	int id,phone,roll;
	char name[40],address[40];
	
};
main(){
	struct student s[100];
	int i,n;
	FILE *fp;
	printf("Enter the number of students you want to store");
	scanf("%d",&n);
	fp=fopen("students.txt","ab");
//	  if (fp == NULL) {
//        printf("Error opening file for writing.\n");
//        return 1;  // Exit if the file can't be opened
//    }

	for(i=0;i<n;i++){
		printf("Enter the id,roll no ,name,address,phone of %d student",i+1);
		scanf("%d%d%s%s%d",&s[i].id,&s[i].roll,s[i].name,s[i].address,&s[i].phone);
		fwrite(&s[i],sizeof(struct student),1,fp);
	
	}
	printf("Data Added sucessfully");
	fclose(fp);
	
	fp=fopen("students.txt","rb");
//	i=0;
	while(fread(&s[i],sizeof(struct student),1,fp)==1){
		printf(" the id=%d\t,roll no=%d\t,name=%s\t,address=%s\t,phone=%d\t ",s[i].id,s[i].roll,s[i].name,s[i].address,s[i].phone);
//		i++;
	}
	fclose(fp);
}
