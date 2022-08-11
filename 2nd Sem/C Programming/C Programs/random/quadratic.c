#include <stdio.h>
#include <math.h>
void main()
{
    float a,b,c,d,x1,x2,real,img;
    printf("Enter coefficients a, b, & c");
    scanf("%f %f %f",&a,&b,&c);
    if(a!=0)
    {
        d=(b*b)-(4*a*c);
        printf("Determinant: %f\n",d);
        if (d==0)
        {
            x1=-b/(2*a);
            printf("Both roots are %f",x1);
        }
        else if (d>0)
            {
                x1=(-b+sqrt(d))/(2*a);
                x2=(-b-sqrt(d))/(2*a);
                printf("The roots are %f & %f",x1,x2);
            }
        else
        {
            real=-b/(2*a);
            img=sqrt(-d)/(2*a);
            printf("The imaginary roots are : %.2f + i%.2f & %.2f-i%.2f",real,img,real,img);
        }
    }
}