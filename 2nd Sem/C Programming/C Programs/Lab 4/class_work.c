//class work. printing area if radius even, perimeter if odd
#include <stdio.h>
#define PI 3.14
void main()
{
    int n;
    float a,p; 
    printf("Enter radius");
    scanf("%d",&n);
    if(n%2==0)    //== because comparing value to 0
    {
        a=PI*n*n;
        printf("Area is %f",a);
    }
    else
    {
        p=2*PI*n;
        printf("Perimeter is %f",p);
    }
}