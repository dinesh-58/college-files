// Newton Raphson method
#include <stdio.h>
#include <math.h>

#define f(x) pow(x,3) + x*x - 1 
#define g(x) 3*x*x + 2*x   // derivative of f(x)
#define e 0.000001

int main() {
    float x0, x1, f0, g0, error;
    printf("enter one initial guess x0: ");
    scanf("%f", &x0);
    printf("\nx0 \t\t f(x0) \t\t f'(x0) \t x1");
    do {
        f0 = f(x0);
        g0 = g(x0);
        x1 = x0 - (f0 / g0);
        printf("\n%f \t %f \t %f \t %f", x0, f0, g0, x1); 
        error = x1 - x0;
        x0 = x1;
    } while (fabsf(error) > e);
    printf("\n The root is %f", x1);
    return 0;
}
