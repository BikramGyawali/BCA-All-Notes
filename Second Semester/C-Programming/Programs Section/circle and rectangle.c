//draw circle and rectangle

#include<stdio.h>
#include<graphics.h>
main(){
	int gd,gm,xr,yr,r,x1,y1,x2,y2;
	gd=DETECT;
	initgraph(&gd,&gm,"C:\");
	printf("Enter the x, y cordinates and radius for the circle");
	scanf("%d%d%d",&xr,&yr,&r);
	circle(xr,yr,r);
	
	printf("Enter the left top corner point of circle  ");
	scanf("%d%d",&x1,&y1);
	printf("Enter the right bottom corner point of circle  ");
	scanf("%d%d",&x2,&y2);
	
	rectangle(x1,y1,x2,y2);
	closegraph();
}
