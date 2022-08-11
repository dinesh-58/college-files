/*WAP to enter records of 5 employees in structure.
Enter name, address, salary, ID & display them in descending order based on name*/
#include<stdio.h>
#include<string.h>
struct employee
{
    char name[25],address[25]; 
    int salary,id;
} e[5],temp;
void main()
{
    int i,j;
    //input
    for(i=0;i<3;i++)  
    {
        printf("Enter name, address, salary & ID of employee %d",i+1);
        scanf(" %[^\n] %[^\n]", e[i].name, e[i].address);
        scanf(" %d",&e[i].salary);
        scanf(" %d",&e[i].id);
    }
    //swap
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            if(strcmp(e[j].name,e[j+1].name)<0) 
            {
                temp=e[j];
                e[j]=e[j+1]; 
                e[j+1]=temp;
            }
        }
    }
    //display
    for(i=0;i<3;i++)
    {
        printf("%s\t%s\t%d\t%d\n",e[i].name,e[i].address,e[i].salary,e[i].id);
    }
}