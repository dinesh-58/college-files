// fixed point method

#include <stdio.h>
#include <math.h>

// f(x) = x^3 + x^2 - 1 = 0
// using f(x), generate x such that x = g(x)
#define g(x) 1/sqrt(x+1)
#define e 0.0000001

int main() {
    float x[2], error;
    printf("Enter initial guess x0 ");
    scanf("%f", &x[0]);
    printf("\n x0 \t\t x1");
    do {
        x[1] = g(x[0]);
        printf("\n %f \t %f", x[0], x[1]);
        error = x[1] - x[0]; 
        x[0] = x[1];
    } while(fabsf(error) > e); // assign error to a variable instead of calculating inside fabsf(). else error
    printf("\n Root is %f", x[1]);
    return 0;
} 


