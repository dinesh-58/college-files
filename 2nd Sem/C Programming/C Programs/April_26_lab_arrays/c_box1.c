#include<stdio.h>
void main()
{
    int i,box1[5]={0,11,22,33,44},box2[5];
    printf("Enter elements of box2");
    for(i=0;i<5;i++)
    {
        scanf("%d",&box2[i]);
    }
    printf("box1:\tbox2:\n");
    for(i=0;i<5;i++)
    {
        printf("%d\t%d",box1[i],box2[i]);
        printf("\n");
    }
}