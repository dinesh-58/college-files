#include<stdio.h>
int n,r,sum=0;
void main()
{
    printf("Enter number");
    scanf("%d",&n);
    while (n!=0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    printf("The sum of digits is %d",sum);
}