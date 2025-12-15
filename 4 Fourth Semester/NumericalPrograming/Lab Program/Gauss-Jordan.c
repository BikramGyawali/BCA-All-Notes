#include <stdio.h>
#include <math.h>
#define max 10
int main() {
    int n, i, j, k;
    double a[max][max+1], x[max];
    double ratio;
    printf("How many unknowns? ");
    scanf("%d", &n);
    printf("\nEnter the augmented matrix:\n");
    for(i=0;i<n;i++)
        for(j=0;j<=n;j++)
            scanf("%lf",&a[i][j]);
    for(j=0;j<n;j++){
        if(fabs(a[j][j]) < 0.000005){
            printf("Pivot element is approximately zero!");
            return 0;
        }
        for(i=0;i<n;i++){
            if(i != j){
                ratio = a[i][j] / a[j][j];
                for(k=j;k<=n;k++){
                    a[i][k] -= ratio * a[j][k];
                }
            }
        }
    }
    for(i=0;i<n;i++)
        x[i] = a[i][n] / a[i][i];
    printf("\nSolution:\n");
    for(i=0;i<n;i++)
        printf("%0.4f ", x[i]);
    return 0;
}

