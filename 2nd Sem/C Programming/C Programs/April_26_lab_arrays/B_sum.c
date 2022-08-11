#include <stdio.h>
void main()
{
    int i,j,a[2][3],b[2][3];
    printf("Enter elements of 1st 2x3 matrix");
    for(i=0;i<2;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("Enter elements of 2nd 2x3 matrix");
    for(i=0;i<2;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    //sum
    for(i=0;i<2;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d\t",a[i][j]+b[i][j]);
        }
        printf("\n");
    }
}