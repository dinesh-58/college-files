#include <stdio.h>
#include <stdlib.h>

void main() {
    char infix[20];
    printf("Enter infix expression");
    scanf(" %[^\n]",infix);
    printf("String was %s",infix);   
}