// euler's method

#include<stdio.h> 
#include<math.h> 
#define f(x, y) x * y
int main() 
{ 
    int i, n; 
    float x0, y0, xp, h, y; 
    printf("Enter initial value of x and y:"); 
    scanf("%f%f",&x0,&y0); 
    printf("Enter x at which y is required:"); 
    scanf("%f",&xp); 
    printf("Enter step-size,h:"); 
    scanf("%f",&h); 
    n=(xp - x0)/h; 
    for(i=0; i < n; i++) 
    { 
        y= y0 + h *f(x0,y0); 
        x0=x0+h; 
        y0=y; 
        printf("%f\t%f\n",x0,y); 
    } 
    printf("\nValue of y at x=%f id %f",x0,y0); 
} 
