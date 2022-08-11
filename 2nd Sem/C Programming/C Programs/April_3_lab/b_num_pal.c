//check if 5 digit number is palindrome or not
#include <stdio.h>
void main()
{
    int n,og,rev=0,r;
    printf("Enter 5 digit number ");
    scanf("%5d",&n);
    og=n;
    for(n=n;n!=0;n/=10);
    {
        r=n%10;
        rev=rev*10+r;
    }
    printf("%d",rev);
    if(rev==og) printf("It is a palindrome");
    else printf("It is not a palindrome");
}