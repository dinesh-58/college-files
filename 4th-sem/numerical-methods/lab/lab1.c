// lab no. 1
// Solution of non-linear equation using Bisection method
// Report contents:
// 1. theory
// 2. algorithm
// 3. pseudocode

#include <stdio.h>
#include <math.h>
#define f(x) sin(x) - (1/x)   // works same as function definition
#define E 0.00001  // error

int main() {
    float x[3], f[3];
    do {
        printf("\n Enter initial values x1 & x2");
        scanf("%f %f", &x[0], &x[1]);
        f[0] = f(x[0]);
        f[1] = f(x[1]);
    } while(f[0] * f[1] > 0); 

    printf("x1 \t x2 \t x3 \t f(x3) \n");
    do {
        x[2] = ((x[0] + x[1]) / 2);   // bisection
        f[2] = f(x[2]);   
        // assignment is done above cause CodeBlocks can't call multiple 
        // functions in 1 statement. try doing without?
        // error if doing without for some reason so just keep same
        printf("%f \t %f \t %f \t %f \n", x[0], x[1], x[2], f[2]);
        if (f[0] * f[2] < 0 )  x[1] = x[2] ;
        else x[0] = x[2];
    } while (fabsf(x[1] - x[0]) > E);
    printf("\n Root is: %f", x[1]);
    return 0;
}

// TODO do regular falsi program in separate file lab2.c
// just change f(x) & x[2] formula according to method
