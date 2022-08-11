//doesn't work
#include<stdio.h>
void main()
{
    int a,b,i,j,count;
    printf("enter two numbers ");
    scanf("%d%d",&a,&b);
    printf("The prime numbers between them are:\n");
    for(i=a;i<=b;i++)
    {
        if(i==1) continue;
        count=0;
        for(j=2;j<=(i/2);j++)
        {
            if(i%j==0) count++;
        }
        if(count==0) printf("%d\t",i);
    }
}