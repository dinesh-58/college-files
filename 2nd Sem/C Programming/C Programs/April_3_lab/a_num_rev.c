#include <stdio.h>
void main()
{
    int n,rev=0,r;
    printf("Enter a number ");
    scanf("%d",&n);
    while (n!=0)
    {
        r=n%10;
        rev=rev*10+r;
        n/=10;     
    }
    printf("The reverse is %d",rev);
}