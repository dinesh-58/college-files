#include<stdio.h>
void main()
{
    int a[10],i,sum=0;
    printf("Enter elements of array");
    for(i=0;i<10;i++)
    {
        scanf("%d",&a[i]);
        sum+=a[i];
    }
    printf("%d",sum);
}