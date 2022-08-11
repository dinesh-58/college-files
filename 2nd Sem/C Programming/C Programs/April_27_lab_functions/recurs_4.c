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
        l=lcm(x,y,h);
    else 
    {
        h=hcf(x,y,y);
        l=lcm(y,x,h);
    }
    printf("HCF is %d. LCM is %d",h,lcm(x,y,h));
}
int hcf(int a,int b,int i)
{
    if(a%i==0 && b%i==0) return i;
    else return hcf(a,b,i-1);
}
int lcm(int a,int b,int j)
{
    int l=j;
    if(j>=b) return l;
    else if(a%j==0 || b%j==0) l*=j;
    else lcm(a,b,j+1);
}
