//input string, write to file named string1.txt
//read from file and count total no. of words

#include <stdio.h>
void main()
{
  FILE *fp = fopen("string1.txt", "r");
  int count=0;
  char cur, bef,aft, s,input[101],store[99];
  // implementation 2:

//input
    // printf("Enter string");
    // scanf("%[^\n]",input);
    // fputs(input,fp);
    // rewind(fp);

  while ((cur=fgetc(fp)) != EOF) {
    if(fseek(fp,-2,SEEK_CUR)) bef=fgetc(fp);
    if(fseek(fp,1,SEEK_CUR)) aft=fgetc(fp); 
    if((char)cur !=' ' && (char)bef ==' ' && (char)aft ==' ') count++; //lmaoo count garena
    fseek(fp,-1,SEEK_CUR);
  }
  count++; 
  printf("There are %d words",count);
  fclose(fp);
}