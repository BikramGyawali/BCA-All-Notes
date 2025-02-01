// multiplication of table of 1 to 5
#include <stdio.h>

int main() {
    int i, j;

    for (i = 1; i <= 5; i++) {
        for (j = 1; j <= 10; j++) {
            printf("%d * %d = %d\n", i, j, i * j);
        }
        printf("\n"); 
    }

    return 0;
}

