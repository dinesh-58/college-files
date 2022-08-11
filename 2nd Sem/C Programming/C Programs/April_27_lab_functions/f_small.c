#include<stdio.h>
void small(int x,int y);
void main()
{
    int a,b;
    printf("Enter 2 numbers");
    scanf("%d%d",&a,&b);
    small(a,b);
}
void small(int x,int y)
{
    if(x<y) printf("The smaller number is %d",x);
    else printf("The smaller number is %d",y);
}