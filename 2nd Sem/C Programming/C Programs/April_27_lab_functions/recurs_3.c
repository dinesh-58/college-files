//sum of natural numbers till n using recursive
#include<stdio.h>
int sum(int n);
void main()
{
    int i;
    printf("Enter n");
    scanf("%d",&i);
    printf("sum of natural numbers till %d is %d",i,sum(i));
}
int sum(int n)
{
    if (n<1) return 0;
    else return n+sum(n-1);
}