#include<stdio.h>
void main()
{
    int n[5],i,s,g;
    printf("Enter 5 numbers for comparing");
    for(i=0;i<=4;i++)
    {
        scanf("%d",&n[i]);
    }
    s=g=n[0];
    for(i=1;i<=4;i++)
    {
        if(n[i]<s) s=n[i];
        else if (n[i]>g) g=n[i];
    }
    printf("The smallest among them is %d & the greatest is %d",s,g);
}