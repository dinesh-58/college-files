#include<stdio.h>
void main()
{
    int l,b,a;
    printf("Enter length & breadth of room");
    scanf("%d%d",&l,&b);
    a=l*b;
    printf("The area is %d \n",a);
    if (a>2500) printf("Auditorium");
    else if(a>500) printf("Hall");
    else if(a>150) printf("Big Room");
    else printf("Small room");
}