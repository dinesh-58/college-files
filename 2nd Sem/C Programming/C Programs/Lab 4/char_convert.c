/*easier implementation is using strupr(), strlwr()? 
*just done this way because asked in question*/
#include<stdio.h>
void main()
{
    char c;
    printf("Enter char");
    scanf("%[A-z]",&c);
    if(c<97) c+=32;
    else c-=32;
    printf("%c",c);
}