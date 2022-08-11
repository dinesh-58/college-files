//Lab DMA, Program 1: WAP to add n numbers using concept of Dynamic Memory Allocation & free the memory later
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int n,i,*p,sum=0;
    printf("Enter how many numbers to add ");
    scanf("%d",&n);
    p=malloc(n*sizeof(int)); /*allocating 2 bytes each for all numbers;
    typecasting malloc return value to int pointer*/
    if(p==NULL){
        printf("Can't allocate memory");
        exit(1);
    }
    for(i=0;i<n;i++)
    {
        printf("enter number ");
        scanf("%d",p+i);    //p + i gives address
        sum=sum+*(p+i);        //*(p+i) gives value at said address
    }
    printf("the sum is %d",sum);
    free(p);
}