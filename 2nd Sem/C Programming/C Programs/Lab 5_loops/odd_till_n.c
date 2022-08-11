#include <stdio.h>
void main()
{
    int a=1, n;
    printf("enter max odd number");
    scanf("%d",&n);
    while(a<=n)
    {
        printf("%d \t",a);
        a+=2;
    }
}