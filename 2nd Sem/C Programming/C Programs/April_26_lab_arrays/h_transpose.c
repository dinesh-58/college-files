#include<stdio.h>
void main()
{
    int m,n,i,j;
    printf("Enter no. of rows & columns ");
    scanf(" %d %d",&m,&n);
    int a[m][n];
    printf("Enter elements ");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf(" %d",&a[i][j]);
        }
    }
    printf("the transpose matrix will be\n");
    for(j=0;j<n;j++)
    {
        for(i=0;i<m;i++)
        {
            printf(" %d\t",a[i][j]);
        }
        printf("\n");
    }
}