#include<stdio.h>
int a,b,c,d,smallest;
void main()
{
    printf("Enter 4 non-equal integers");
    scanf("%d%d%d%d",&a,&b,&c,&d);
    if (a<b)
    {
        if(a<c)
        {
            if(a<d) smallest=a;     
            else smallest=d;        
        }
        else if(c<d) smallest=c;    
        else smallest=d;
    }
    else if (b<c)
    {
        if (b<d) smallest=b;
        else smallest=d;
    }
    else if (c<d) smallest=c;
    else smallest=d;
    printf("The smallest number is %d",smallest);
}
