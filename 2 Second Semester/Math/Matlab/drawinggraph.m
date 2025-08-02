% Draw the circle

r=input("Enter the radius:")
Enter the radius:2

r =

     2

t=[0:0.1:2*pi];
x=r*cos(t);
y=r*sin(t);
ploat(x,y,'g');
 
xlabel("x-axis")
ylabel("y-axis")
title("Circle")