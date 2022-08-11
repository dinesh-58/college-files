#include<stdio.h>
void main()
{
    int n,m;
    printf("Enter sizes of the 2 one-dimensional arrays");
    scanf("%d%d",&n,&m);
    int a[n],b[m],c[n+m],i;
    printf("Enter elements of 1st array");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter elements of 2nd array");
    for(i=0;i<m;i++)
    {
        scanf("%d",&b[i]);
    }   
    for(i=0;i<n+m;i++)
    {
        if (i<n) c[i]=a[i];
        else c[i]=b[i-n];
        printf("%d \t",c[i]);
    }
}