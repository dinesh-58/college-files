#include<stdio.h>
void div();
void main()
{
    div();
}
void div()
{
    float x,y;
    float q;
    printf("Enter 2 numbers ");
    scanf("%f%f",&x,&y);
    printf("The quotient is %.2f",x/y);
}