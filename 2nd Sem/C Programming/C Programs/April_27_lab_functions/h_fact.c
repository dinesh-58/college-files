#include<stdio.h>
void fact();
void main()
{
    fact();
}
void fact()
{
    int n,i,f=1;
    printf("enter number");
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
        f=f*i;
    }
    printf("the factorial is %d",f);
}