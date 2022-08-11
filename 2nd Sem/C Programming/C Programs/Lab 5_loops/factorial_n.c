#include <stdio.h>
void main()
{
    int n,f=1,i=1;
    printf("Enter number to find factorial");
    scanf("%d",&n);
    f=n;
    while (i<n)
    {
        f=f*(n-i);
        i++;
    }
    printf("The factorial is %d",f);
}