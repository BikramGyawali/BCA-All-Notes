syms x





limit ((x^3+5)/(x^4+7))
 
ans =
 
5/7
 

%2 question

syms x
limit (1/x,x,inf)
 
ans =
 
0

%question nbr 3

syms x
limit(abs(x-2)/(x-2),x,2,'left')
 
ans =
 
-1
 
syms x
limit(abs(x-2)/(x-2),x,2,'right')
 
ans =
 
1
 %question 4
 x1=-3:1:-1;
eq1=(4*x1)+3;
x2=-1:1:1;
eq2=x2;
figure
x=[x1 x2]

x =

    -3    -2    -1    -1     0     1

y=[eq1 eq2];
plot(x,y)
 

%question 5

x1=-1:1:5;
eq1=x1+1;
x2=-5:1:5;
eq2=x2;
figure
x=[x1 x2];
y=[eq1 eq2];
plot(x,y)


%question 6

x1=-1:1:5;
eq1=x1+1;
x2=-5:1:5;
eq2=x2.^2;
figure
x=[x1 x2];
y=[eq1 eq2];
plot(x,y)



