#include<stdio.h>
int hcf(int a,int b,int i);
int lcm(int a,int b,int j);
void main()
{
    int x,y,h,l;
    printf("enter 2 numbers");
    scanf("%d%d",&x,&y);
    if(x<y) 
    {
        h=hcf(x,y,x);
        l=lcm(x,y,y);
    }
    else
    {
        h=hcf(x,y,y);
        l=lcm(y,x,x);
    }
    printf("HCF is %d. LCM is %d",h,l);
}
int hcf(int a,int b,int i)
{
    if(a%i==0 && b%i==0) return i;
    else return hcf(a,b,i-1);
}
int lcm(int a,int b,int i)
{
    if(i%a==0 && i%b==0) return i;
    else return lcm(a,b,i+1);
}
