/*WAP to read name, roll no. of 3 students from structure & write to file.
Read from file & display */
#include<stdio.h>
struct student{
    char name[20];
    int roll;
} s[3],fs[3]; //1st structure var for storing input, 2nd for from file
void main()
{
    int i;
    FILE *fp=fopen("structure_student.txt","wb+");
    for(i=0;i<3;i++){
        printf("Enter name, roll no. of student %d ",i+1);
        scanf(" %[^\n] %d",s[i].name,&s[i].roll);
    }
    fwrite(s,sizeof(s),1,fp);
    rewind(fp);
    fread(fs,sizeof(fs),1,fp);
    for(i=0;i<3;i++)
    {
        printf("%s %d\n",fs[i].name,fs[i].roll);
    }
    fclose(fp);
}