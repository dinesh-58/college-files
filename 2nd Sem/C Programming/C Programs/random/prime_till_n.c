#include<stdio.h>
void main()
{
    int i,j,n,c=0;
    printf("Enter number till which you want to find prime numbers ");
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
        for(j=2;j<=i;j++)
        {
            if(i%j==0) 
            c++;
        }
        if(c<2) printf("%d\t",i);
        c=0;
    }
}