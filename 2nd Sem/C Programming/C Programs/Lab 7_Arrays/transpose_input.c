#include<stdio.h>
void main()
{
    int i,j,m,n;
    printf("Enter no. of rows & columns for matrix");
    scanf("%d%d",&m,&n);
    int x[m][n];  
    printf("Enter elements of matrix");
    for(i=0;i<m;i++)     //Matrix Input
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    printf("The transpose matrix will be \n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("%d \t",x[j][i]);
        }
        printf("\n");
    }
}