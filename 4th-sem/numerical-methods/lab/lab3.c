// Newton Raphson method
#include <stdio.h>
#include <math.h>

#define f(x) sin(x) + cos(x) + exp(x) - 8 // exp(x) means e^x
#define g(x) cos(x) - sin(x) + exp(x)  // derivative of f(x)
#define e 0.000001

int main() {
    float x1, x2, f1, g1, error;
    printf("enter one initial guess x1: ");
    scanf("%f", &x1);
    printf("\nx1 \t\t f(x1) \t\t f'(x1) \t x2=x1=f(x1)-g(x1)");
    do {
        f1 = f(x1);
        g1 = g(x1);
        x2 = x1 - (f1 / g1);
        printf("\n%f \t %f \t %f \t %f", x1, f1, g1, x2); 
        error = x2 - x1;
        x1 = x2;
    } while (fabsf(error) > e);
    printf("\n The root is %f", x2);
    return 0;
}
