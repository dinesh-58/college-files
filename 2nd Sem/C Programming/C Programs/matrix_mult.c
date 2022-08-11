#include<stdio.h>
#include<stdlib.h>
void main()
{
    int m,n,p,q,i,j,k,sum=0;
    printf("enter order of matrix A");
    scanf(" %d %d",&m,&n);
    printf("enter order of matrix B");
    scanf(" %d %d",&p,&q);
    if (n!=p){
        printf("Order Mismatch! Multiplication not possible");
        exit(1);
    }
    int a[m][n],b[p][q];
    //input
    printf("Enter elements of matrix A");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf(" %d",&a[i][j]);
        }
    }
    printf("Enter elements of matrix B");
    for(i=0;i<p;i++)
    {
        for(j=0;j<q;j++)
        {
            scanf(" %d",&b[i][j]);
        }
    }
    printf("Their product matrix is:\n");
    for(i=0;i<m;i++) 
    {
        for(j=0;j<q;j++)
        {
            for(k=0;k<p;k++)
            {
                sum+=a[i][k]*b[k][j];  //sum is basically c[i][j]
            }
            printf("%d\t",sum);
            sum=0;
        }
        printf("\n");
    }
}