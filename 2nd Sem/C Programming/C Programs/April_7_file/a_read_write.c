#include<stdio.h>
void main()
{
    char in[50],t[50];
    FILE *fp;
    fp=fopen("HCOE.txt","a+");
    printf("Enter string");
    scanf("%[^\n]",in);
    fputs(in,fp);
    rewind(fp);
    fgets(t,8,fp);
    puts(t);
    fclose(fp);
}