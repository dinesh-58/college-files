//test?//
#include<stdio.h>
#define PI 3.14
void main()
{
    int choice;
    printf("Select your choice:\n 1: Area of circle \n 2: Even or Odd \n 3: Area of Rectangle \n 4: Celsius to Fahrenheit Conversion \n 5: +ve or -ve number");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1:
            float a_c,r;
            printf("Enter radius of circle ");
            scanf("%f",&r);
            a_c=PI*r*r;
            printf("The area is %f",a_c);
            break;
        case 2:
            int n;
            printf("Enter number ");
            scanf("%d",&n);
            if (n%2==0) printf("even");
            else printf("odd");
            break;
        case 3:
            int l,b,a;
            printf("Enter length & breadth of rectangle ");
            scanf("%d%d",&l,&b);
            a=l*b;
            printf("Area is %d",a);
            break;
        case 4:
            float c,f;
            printf("Enter temperature in Celsius ");
            scanf("%f",&c);
            f=c/5*9+32;
            printf("Fahrenheit equivalent is %.2f",f);
            break;
        case 5:
            printf("Enter number ");
            scanf("%d",&n);
            if (n>0) printf("+ve number");
            else printf("-ve number");
            break;
        default:
            printf("Wrong input");
    }
}