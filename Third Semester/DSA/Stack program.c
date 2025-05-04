//program for stack operation

#include<stdio.h>
#include<stdlib.h>
#define size 4
int top=-1,array[size];
void push();
void pop();
void show();

int main(){
	int choice,i;
	while(2){  // we use the non negative number to create the infinte looop
		printf("\nPerform stack on operation:");
		printf("\n 1. Push the element \n 2. Pop the element \n 3. Show the element \n 4. End");
		printf("\n\nEnter your choice ");
		scanf("%d", &choice);
		
		switch(choice){
			case 1:
				push();
				break;
				
			case 2: 
			pop();
			break;
			
			case 3: 
			show();
			break;
			
			case 4:
			exit(0);
				break;
				default:
					printf("Invalid choice");
					
		}
		
		
	}
}

void push(){
	int num;
	if(top==size-1){
		printf("stack over flow");
		
	}
	else{
		printf("Enter the element");
		scanf("%d",&num);
		top=top+1;
		array[top]=num;
	
	}
}

void pop(){
	if(top==-1){
		printf("The stack is underflow");
		
			}
			
			else{
			printf("\n poped element : %d",array[top]);
			top=top-1;
				
			}
}

void show(){
	int i;
	if(top==-1){
		printf("\nUnder flow");
	}
	else{
		printf("\n Element present in the stack : \n"	);
		for( i=0;i<=top;i++){
			printf("%d\n",array[i]);
		}
	}
}
