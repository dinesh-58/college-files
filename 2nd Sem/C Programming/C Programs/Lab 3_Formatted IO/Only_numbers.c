//practice no. 3, pg. 16
#include <stdio.h>
void main()
 {
    char n[10];
    printf("Only numbers can be entered");
    scanf("%[0-9]",n);
    printf("%s",n);
}