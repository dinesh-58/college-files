//Lab2, Assignment 3: WAP to find maximum between two numbers using conditional (ternary) operator
#include<stdio.h>
void main()
{
    int a,b,m;
    printf("Enter 2 numbers");
    scanf("%d%d",&a,&b);
    m=(a>b)?a:b;
    printf("the maximum among them is %d",m);
}