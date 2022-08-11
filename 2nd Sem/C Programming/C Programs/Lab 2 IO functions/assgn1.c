//Lab2, Assignment 1: WAP to swap the values of 2 variables given by the user
#include<stdio.h>
void main()
{
    int a,b,temp;
    printf("Enter two numbers a & b");
    scanf("%d%d",&a,&b);
    temp=a;
    a=b;
    b=temp;
    printf("After swapping, a=%d & b=%d",a,b);
}