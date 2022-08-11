#include<stdio.h>
void main()
{
    int i,a[5],s,l;
    printf("Enter array elements");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    s=a[0];
    l=a[0];
    for(i=1;i<5;i++)
    {
        if(s>a[i]) s=a[i];
        if(l<a[i]) l=a[i];
    }
    printf("Smallest is %d,\nLargest is %d",s,l);
}