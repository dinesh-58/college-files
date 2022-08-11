#include<stdio.h>
void main()
{
    int i,j;
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=5;j++)
        {
            if(j<=3-i || j>=3+i) printf(" ");    //simpler version would be to use if conditions for * 
            else printf("*");
        }
        printf("\n");
    }
}