//Sequential Search
//✔    try with characters in array only 1st
//✔ then string
//✔ count how many results & at what position(s)
//DMA for array (I'm overthinking this. 
//✔ just take n input & declare array a[n][20])
//✔ then with structure & show other details for search result


#include<stdio.h>
#include<string.h>
void main()
{
    int i,count=0,n;
    printf("How many records do you want to enter? ");
    scanf("%d",&n);
    char key[20];
    struct sus
    {
        int roll;
        char a[20];
    }s[n];
    for(i=0;i<n;i++)
    {
        printf("Enter roll & name of student %d ",i+1);
        scanf("%d %[^\n]",&s[i].roll,s[i].a);
    }
    printf("Enter search query ");
    scanf(" %[^\n]",&key);
    for(i=0;i<3;i++)
    {
        if (strcmp(s[i].a,key)==0) 
        {
            printf("Found at position %d\n %d\t%s\n",i+1,s[i].roll,s[i].a);
            count++;
        }
    }
    printf("%d results",count);
}