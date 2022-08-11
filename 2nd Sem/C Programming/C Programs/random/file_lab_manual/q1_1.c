//input string, write to file named string1.txt
//read from file and count total no. of words

//issue is if whitespaces are added to end, count increases by 1; 
#include <stdio.h>
void main()
{
  FILE *fp = fopen("string1.txt", "r");
  int count=0;
  char c, s,input[101],store[99];
  // implementation 1:

//input
    // printf("Enter string");
    // scanf("%[^\n]",input);
    // fputs(input,fp);
    // rewind(fp);

  while ((c=fgetc(fp)) != EOF) {
    fseek(fp,-1,SEEK_CUR);
    if(fscanf(fp,"%s",store)) count++; //because scanf stops reading at space
    if((char)fgetc(fp)==' ') count--;  //hmmm can;t find a way to decrease 
    //when extra space encountered
    fseek(fp,-1,SEEK_CUR);
  }
  printf("There are %d words",count);
  fclose(fp);
}