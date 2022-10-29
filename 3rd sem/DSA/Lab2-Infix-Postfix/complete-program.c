#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define SIZE 20
char stack[SIZE], top=-1;

void push(char operator);
char pop();
int precedence(char operator);

void main() {
    int i;
    char c, infix[SIZE], temp;
    // TODO delete later
    FILE * fp =fopen("temp.txt","r");
    fscanf(fp, "%s", infix);
    // TODO uncommment these later
    // ! printf("Enter infix expression ");
    // ! scanf("%[^\n]",infix);

    for (i=0; infix[i]!='\0'; i++) {   
        c = infix[i];
        if(isalnum(c)) {
            printf("%c",c);
        }
        else { // character is an operator
            if (top == -1 || c == '(') push(c);
            else if (c == ')') {
                while ((temp=pop()) != '(') {
                    printf("%c", temp);
                }
            }
            else{
                while (precedence(stack[top]) >= precedence(c)) {
                    printf("%c", pop());
                }
                push(c);
            }
        }
    }
    while(top!=-1) {
        printf("%c", pop());
    }
}

void push(char operator) {
    if (top == SIZE-1) {
        printf("\n Error: Overflow");
        exit(1);
    }
    // no need for else because program exits if condition met 
    stack[++top] = operator;
}

char pop() {
    if (top == -1) {
        printf("\n Error: Underflow");
        exit(1);
    }
    // no need for else because program exits if condition met 
    return stack[top--];
}

int precedence(char operator) {
    switch(operator) {
        case '(':
            return 0;
            // Theoretically, parenthesis would have the highest precedence. 
            // But when this function is called while comparing operators, '(' 
            // will get popped since it has the highest value.
            // And later when ')' is encountered, infinite loop will occur since 
            // '(' is no longer in the stack. Thus, we set precedence 0 so that 
            // '(' doesn't get popped unnecessarily.

        case '^':
            return 3;

        case '*':
        case '/':
            return 2;

        case '+':
        case '-':
            return 1;
        default:    
            return 0;
    }
} 
