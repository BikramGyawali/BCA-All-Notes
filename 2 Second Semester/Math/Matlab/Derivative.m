% starting derivative

% 1) Find the derivative of f(x)=3x^2 using  matlab
% ans : syms x
%diff(3*x.^2)
 
%ans =
 
%6*x
 


%2) e^x
%ans :   syms x   > diff (exp(x))
 

 
% exp(x)
 
%3) 1/x
% ans:syms x
diff(1/x)
 
ans =
 
-1/x^2


% 4)log x
syms x
diff (log(x))
 
ans =
 
1/x



%5)sinx*cosx
syms x
diff (sin(x)*cos(x))
 
ans =
 
cos(x)^2 - sin(x)^2


%6) e^x*tanx

syms x
diff (exp(x)*tan(x))
 
ans =
 
exp(x)*tan(x) + exp(x)*(tan(x)^2 + 1)
 

%7) derivative of (2x+3)/sqrt(x)

syms x
diff ((2*x+3)/sqrt(x))
 
ans =
 
2/x^(1/2) - (2*x + 3)/(2*x^(3/2))
 


