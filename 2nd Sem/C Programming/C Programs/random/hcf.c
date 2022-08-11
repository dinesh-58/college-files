//WAP to find hcf among 2 using function
//hint: function is always <= smallest number
#include<stdio.h>
void calc_hcf(int x, int y);
void main()
{
    int a,b;
    printf("Enter 2 numbers");
    scanf("%d %d",&a,&b);
    calc_hcf(a,b);
}

void calc_hcf(int x, int y)
{
    int h,s,i;
    s = x<y? x: y;
    for(i=s;i>0;i--)
    {
        if(x%i == 0 && y%i == 0) {
            h = i;
            break;
        }
    }
    printf("Their hcf is %d",h);
}