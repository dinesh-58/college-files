#include <stdio.h>
void main()
{
    int i,j,n[2][3];
    printf("Enter elements of 2x3 matrix");
    for(i=0;i<2;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&n[i][j]);
        }
    }
    for(i=0;i<2;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d\t",n[i][j]);
        }
        printf("\n");
    }
}