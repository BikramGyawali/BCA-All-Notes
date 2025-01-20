#include <stdio.h>
int main() 
{
int n, i, sum = 0;
float average;
printf("Enter the number of integers: ");
scanf("%d", &n);
int numbers[n];
printf("Enter %d integers:\n", n);
for (i = 0; i < n; i++) {
printf("Enter integer %d: ", i + 1);
scanf("%d", &numbers[i]);
sum += numbers[i]; 
 }
average = (float)sum / n; 
printf("The average value is: %.2f\n", average);
return 0;
}
