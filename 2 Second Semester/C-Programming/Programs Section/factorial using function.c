#include <stdio.h>
 main() {
    int n, result;
    printf("Enter the number you want to make factorial: ");
    scanf("%d", &n);

    result = fact(n);
    printf("The factorial of %d is %d\n", n, result);    
}

fact( a) {
    int i, fact = 1;
    for(i = 1; i <= a; i++) {
        fact = fact * i;
    }
    return fact;
}

