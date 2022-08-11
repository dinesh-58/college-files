/*WAP to input student name, roll no. & write to file.
Read from file & display*/
#include<stdio.h>
void main()
{
    int roll,fr;
    char name[20],fn[20];
    FILE *fp=fopen("stud.txt","w+");
    printf("Enter name & roll no. ");
    scanf("%[^\n] %d",name,&roll);
    fprintf(fp,"%s \n%d",name,roll);
    rewind(fp);
    fscanf(fp,"%[^\n] %d",fn,&fr);
    printf("Name: %s \nRoll no: %d",fn,fr);
    fclose(fp);
}