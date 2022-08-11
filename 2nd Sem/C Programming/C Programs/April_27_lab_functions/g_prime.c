#include<stdio.h>
void prime();
void main()
{
    prime();
}
void prime()
{
    int n,i,count=0;
    printf("enter a number ");
    scanf("%d",&n);
    for(i=2;i<n;i++)
    {
        if(n%i==0) count++;
    }
    if (count==0) printf("prime");
    else printf("not prime");
}