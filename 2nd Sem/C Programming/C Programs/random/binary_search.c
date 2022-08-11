//sorting in any order
//then dividing in half using 1st character of key/query.
#include<stdio.h>
#include<string.h>
void main()
{
    int i,j;
    char a[4][10],key[10],temp;
    //input
    printf("Enter names");
    for(i=0;i<4;i++)
    {
        scanf(" %[^\n]",a[i]);
        strlwr(a[i]);
    }
    //sort
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            if(strcmp(a[j],a[j+1])>0)
            {
                strcpy(temp,a[j]);
                strcpy(a[j],a[j+1]);
                strcpy(a[j+1],temp);
            }
        }
    }
    //search. wut? keep dividing till only 1 letter?
    printf("Enter search term");
    scanf("%[^\n]",key);
    strlwr(key);
    //while(found!=1)
    //or, for(i=0;i<12)
        //if (key[][0]=='n') midpoint heh? k garne 2 3 ota n dekhi start
        //hune aayo bhane
        //prob array lai chai divide in half.
} 