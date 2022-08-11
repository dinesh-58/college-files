#include<stdio.h>
int add(int a,int b);
void main()
{
    int x,y;
    printf("enter two numbers");
    scanf(" %d %d",&x,&y);
    printf("The sum is %d",add(x,y));
}
int add(int a,int b)
{
    return a+b;
}