#include <stdio.h>
void main()
{
    int n;
    printf("Enter number");
    scanf("%d",&n);
    printf("Divisible by 3 but not by 7? ");
    if (n%3==0)
    {
        if (n%7==0) printf("Not possible");
        else printf("Possible");
    }
    else printf("Not possible");
}