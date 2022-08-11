//Lab DMA, Program 2: WAP to sort n numbers in ascending order using concept of Dynamic Memory Allocation & free the memory later
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int n,i,j,*p,t;
    printf("Enter how many numbers you want to store ");
    scanf("%d",&n);
    p=(int *)malloc(n*sizeof(n));
    printf("enter the numbers ");
    for(i=0;i<n;i++)
    {
        scanf(" %d",p+i);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-1;j++)   //j<n-1 because we compare with j+1 & it might swap garbage value
        {
            if(p[j]>p[j+1])  //p[j+1] can be written as *(p+j+1) 
            {
                t=p[j+1];
                p[j+1]=p[j];  
                p[j]=t;
            }
        }
    }
    //display
    for(i=0;i<n;i++)
    {
        printf("%d\t",p[i]);
    }
    free(p);
}