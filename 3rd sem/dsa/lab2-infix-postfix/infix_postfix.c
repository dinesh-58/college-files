#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

const int size = 20;
int top=-1;
char stack[size];

int priority(char x);
void push(char y);
char pop();

void main() {
    char infix[size],c,temp ;
    int i;
    printf("Enter infix expression");
    scanf(" %[^\n]",infix);
    printf("\n Post-fix expression is: ");
    for (i=0; i<size; i++) {
        c = infix[i];
        switch (c) {
            case '(' :
                push(c);
                break;
            case ')' :
                while(temp=pop() != '(') printf("%c",temp);
            break;
            default :
                if (isalnum(c)) printf("%c",c); 
                else {
                    push(c);
                    if (priority(top) >= priority(c))
                }
        }
    }
}

int priority(char x) {
    if (x=='^') return 5;
    else if (x=='*' || x=='/') return 4;
    else if (x=='+' || x=='-') return 3;
    else return 0;
}

void push(char y) {
    stack[++top] = y;
    if (top == size-1) {
        printf("Overflow");
        exit(1);
    }
}

char pop() {
    if (top == -1) {
        printf("Underflow");
        exit(1);
    }
    char temp = stack[top]; 
    stack[top--] = 0;
    return temp; 
}