// Integration using trapezoidal rule

#include <stdio.h>
#include <math.h>

float f(float x) {
    return cos(x) / (1 + x*x);
} 

int main() {
    float a,b,h, x, result=0;
    int n, i;
    printf("enter lower limit(a) & upper limit(b) of integral ");
    scanf("%f %f", &a, &b);
    printf("\n enter number of sub-intervals (n) ");
    scanf("%d", &n);
    h = (b-a) / n;

    for(x=a; x<=b; x+=h) {
        // if wrong answer, assign f(x) to a variable
        result += (x==a || x==b) ? f(x) : 2*f(x); 
    }
    result *= h/2;
    printf("\n Result is %f", result);
    return 0;
}
