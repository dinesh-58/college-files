#include <stdio.h> 

int fibo(int n) {
    int temp;
    if (n==1) {
        return 1; 
    } 
    if (n==0) { 
        return 0;
    }
    //else 
    temp = fibo(n-1)+fibo(n-2);
    printf("%d \t", temp);
    return temp;
}

void main() {
    int n;
    printf("How many recursive numbers do you want to find? ");
    scanf("%d",&n);
    printf("The numbers are: 1 \t");
    fibo(n);
}