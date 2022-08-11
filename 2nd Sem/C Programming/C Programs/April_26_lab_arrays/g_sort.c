//sort once, then for opposite sort, just print in reverse instead of sorting using reverse logic.
#include<stdio.h>
void main()
{
    int a[5],i,j,temp;
    printf("Enter elements of array");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    //sorting in ascending order
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("Ascending order:\tDescending order:\n");
    printf("\t|             \t\t|\n");
    printf("\tv             \t\tv\n\n");
    for(i=0;i<5;i++)
    {
    printf("\t%d             \t\t%d\n",a[i],a[4-i]);
    }
}