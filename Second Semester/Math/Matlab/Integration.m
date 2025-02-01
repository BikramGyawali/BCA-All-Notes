% find the integration of 


%1) 2x^2

syms x
int (2*x.^2)
 
ans =
 
(2*x^3)/3
 

%2) log(x)

syms x
int (log(x))
 
ans =
 
x*(log(x) - 1)
 

%3) sin 2x

syms x
int (sin(2*x))
 
ans =
 
sin(x)^2


%4) 1/(1+x^2)

syms x
int (1/(1+x^2))
 
ans =
 
atan(x)
 

%5)