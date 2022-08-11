#include <stdio.h>
void main()
{
    int i,j,m[3][3];
    printf("Enter elements of matrix");
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++)
        {
            scanf("%d",&m[i][j]);
        }
    }
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++)
        {
            printf("%d \t",m[j][i]);
        }
        printf("\n");
    }
}
            