// integration using simpson's 3/8

#include <stdio.h>
#include <math.h>

float f(float x) {
    return cos(x) / (1 + x*x);
} 

int main() {
    float a,b,h, x, y, result=0;
    int n, i;
    printf("enter lower limit(a) & upper limit(b) of integral ");
    scanf("%f %f", &a, &b);
    printf("\n enter number of sub-intervals (n) ");
    scanf("%d", &n);
    h = (b-a) / n;

    for (i=0; i<=n; i++) {
        // if wrong answer, assign f(x) to a variable
        x = a + i*h;
        y = f(x);
        result += (i==0 || i==n) ? y 
            : (i%3 == 0) ? 2*y 
            : 3*y; 
    }
    result *= 3*h/8;
    printf("\n Result is %f", result);
    return 0;
}
