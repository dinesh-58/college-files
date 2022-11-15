#include <stdio.h>

void main() {
    int n;
    printf("How many recursive numbers do you want to find? ");
    scanf("%d",&n);
    int i, a, b, temp;
    a = b= 0;
    temp = 1;
    if (n>0) {
        printf("The fibonacci numbers are:\t 1 \t"); 
        for (i = 0; i < n-1; i++)
        {
            a = b;
            b = temp;
            temp = a + b;
            printf("%d \t", temp);
        }
    }
}