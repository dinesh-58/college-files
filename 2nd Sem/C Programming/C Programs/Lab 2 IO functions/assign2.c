/*Lab2, Assignment 2: WAP to calculate compound interest amount(a) when p,n,r
are given 
Hint: a=p*(1+r)^n*/
#include<stdio.h>
#include<math.h>
void main()
{
    int n,r;
    float a,p;
    printf("Enter principle, rate & number of years");
    scanf(" %f %d %d",&p,&r,&n);
    a=p*pow(1+r,n);
    printf("The compound interest is Rs. %.2f",a);
}