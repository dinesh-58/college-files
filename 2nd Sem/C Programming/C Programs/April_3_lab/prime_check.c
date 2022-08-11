#include<stdio.h>
void main()
{
    int i,n,count=0;
    printf("Enter number ");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0) count++;
    }
    if(count==0) printf("It is a prime number");
    else printf("It is not a prime number");
}