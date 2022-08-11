#include<stdio.h>
int multi();
void main()
{
    int m;
    m=multi();
    printf("The product is %d",m);
}
int multi()
{
    int x,y;
    printf("enter 2 numbers ");
    scanf("%d%d",&x,&y);
    return x*y;
}