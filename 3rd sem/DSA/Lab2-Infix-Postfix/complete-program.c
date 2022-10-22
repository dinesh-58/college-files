#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define SIZE 12
char stack[SIZE], top=-1;

void push(char operator);
void pop();
int precedence(char operator);

void main() {
    int i;
    char c, infix[SIZE];

    // TODO delete later
    FILE * fp =fopen("temp.txt","r");
    fscanf(fp, "%s", infix);
    // TODO uncommment these later
    // ! printf("Enter infix expression ");
    // ! scanf("%[^\n]",infix);

    for (i=0; infix[i]!=0; i++) {
        c = infix[i];
        if(isalnum(c)) {
            printf("%c",c);
        }
        else { // character is an operator
            if (top == -1) push(c);
            else if (c == ')') {
                do {
                    pop();
                } while(stack[top] != '(');
                top--;
            }
            else if (precedence(stack[top]) >= precedence(c)) {
                pop();
                push(c);
            }
            else push(c);
        }
    }
    while(top!=-1) {
        pop();
    }
    // TODO solve

}

void push(char operator) {
    if (top == SIZE-1) {
        printf("\n Error: Overflow");
        exit(1);
    }
    // no need for else because program exits if condition met 
    stack[++top] = operator;
}

void pop() {
    // if (top == -1) {
    //     printf("\n Error: Underflow");
    //     exit(1);
    // }
    // no need for else because program exits if condition met 
    if (stack[top] != '(') printf("%c", stack[top--]);
}

int precedence(char operator) {
    switch(operator) {
        case '(':
        case ')':
            return 4;

        case '^':
            return 3;

        case '*':
        case '/':
            return 2;

        case '+':
        case '-':
            return 1;

    }
} 
