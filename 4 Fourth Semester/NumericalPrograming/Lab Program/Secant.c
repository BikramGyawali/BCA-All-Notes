#include <stdio.h>
#include <math.h>

double f(double x)
{
    return x * x - 4;
}

int main()
{
    double a, b, c, e;
    int i, n;

    printf("Initial guesses (a b): ");
    scanf("%lf %lf", &a, &b);

    printf("Error tolerance (E): ");
    scanf("%lf", &e);

    printf("Maximum Iteration (N): ");
    scanf("%d", &n);

    i = 0;

    do
    {
        if (fabs(f(b) - f(a)) < 0.00005)
        {
            printf("Mathematical Error!");
            return 0;
        }

        c = (a * f(b) - b * f(a)) / (f(b) - f(a));
        a = b;
        b = c;
        i++;

        if (i > n)
        {
            printf("Error: Not convergent");
            return 0;
        }

    } while (fabs(f(c)) > e);

    printf("After %d iterations, Root = %lf", i, c);

    return 0;
}

