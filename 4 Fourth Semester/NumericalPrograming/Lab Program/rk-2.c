#include <stdio.h>
#include <math.h>

float f(float x, float y)
{
    return (x * x - y);
}

int main()
{
    double x0, y0, xn, h;
    double x, y,k1,k2,k;
    int i, n;

    printf("Enter x0 y0 xn n:\n");
    scanf("%lf %lf %lf %d", &x0, &y0, &xn, &n);

    h = (xn - x0) / n;
    x = x0;
    y = y0;

    printf("\nSolution:\n");
    printf("x\t y\n");
    printf("%.2lf\t %.6lf\n", x, y);

    for (i = 1; i <= n; i++)
    {
    	k1= h * f(x, y);
		k2=h*f(x+h,y+k1);
		k=(k1+k2)/2;
		        y = y +k;
        x = x + h;
        printf("%.2lf\t %.6lf\n", x, y);
    }

    return 0;
}

