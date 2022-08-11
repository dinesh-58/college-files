#include <stdio.h>
void main()
{
    //display only 8
    //5 blanks then 8
    char a[20];
    int i;
    scanf("%[^\n]",a);
    printf("Only 1st 8\n");
    for(i=0;i<8;i++)
    {
        printf("%c",a[i]);
    }
    printf("\nNo.2\n     ");
    for(i=0;i<8;i++)
    {
        printf("%c",a[i]);
    }
}