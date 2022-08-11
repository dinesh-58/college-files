#include<stdio.h>
#include<string.h>
void main()
{
    char s[30],temp;
    int i,n,l;
    printf("Enter string ");
    scanf("%[^\n]",s);
    l=strlen(s);
    n=l/2;
    for(i=0;i<n;i++)
    {
        temp=s[i];
        s[i]=s[l-i-1];
        s[l-i-1]=temp;
    }
    printf("The reversed string is %s",s);
}