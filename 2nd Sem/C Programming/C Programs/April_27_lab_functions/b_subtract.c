#include<stdio.h>
void subtract(int a,int b);
void main()
{
    int x,y;
    printf("enter 2 numbers ");
    scanf("%d%d",&x,&y);
    subtract(x,y);
}
void subtract(int a, int b)
{
    printf("Their difference is %d",a-b);
}