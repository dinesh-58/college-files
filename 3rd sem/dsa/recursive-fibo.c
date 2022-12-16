#include <stdio.h> 

int fibo(int n, int disp) {
    int temp;
    if (n==1) {
        if (disp==1) printf("1 \t");
        return 1; 
    } 
    else if (n<=0) { 
        return 0;
    }
    temp = fibo(n-1, disp)+fibo(n-2, 0);
    if (disp == 1) printf("%d \t", temp);
    return temp;
}

void main() {
    int n;
    printf("How many recursive numbers do you want to find? ");
    scanf("%d",&n);
    printf("The numbers are: \t");
    fibo(n, 1);
}
