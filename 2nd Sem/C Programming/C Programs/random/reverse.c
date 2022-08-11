#include<stdio.h>
#include<conio.h>
int n,r,rev;
void main()
{
    printf("Enter number");
    scanf("%d",&n);
    while (n!=0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    printf("The reversed number is %d",rev);
    getch();
}