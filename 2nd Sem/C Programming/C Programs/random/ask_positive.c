//keeps asking input till 0 or -ve entered; then prints sum & average of numbers till then
#include<stdio.h>
void main()
{
    int n,sum,avg,c=0;
    printf("Enter 1st number");
    scanf("%d",&n);
    do
    {
        sum=sum+n;
        c++;
        printf("Enter next number");
        scanf("%d",&n);
    } while (n>0);
    avg=sum/c;
    printf("The sum is %d & the average is %d",sum,avg);
}