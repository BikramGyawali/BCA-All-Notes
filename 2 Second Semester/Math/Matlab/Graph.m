%graph1 )Draw the Graph of f(x)=x^2+5x+6 for x between -6 and 6
x=[-6:1:6];
y=x.^2+5*x+6;
plot(x,y)
 xlabel ('x')
 ylabel ('y')
 
 %graph2 ) Draw the graph of y=sinx from -pi to pi
 x=[-pi:pi/10:pi]
 y=sin (x);
  plot(x,y)
xlabel ('x')
ylabel ('y')
 

%Graph 3)  Draw the graph of y=exp(x) from -10 to 10

x=[-10:1:10];
y=exp(x);
plot(x,y);
xlabel('x-axis')
