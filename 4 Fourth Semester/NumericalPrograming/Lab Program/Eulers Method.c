#include <stdio.h>
#include <math.h>

float f(float x, float y)
{
    return (x * x - y);
}

int main()
{
    double x0, y0, xn, h;
    double x, y;
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
        y = y + h * f(x, y);
        x = x + h;
        printf("%.2lf\t %.6lf\n", x, y);
    }

    return 0;
}

