#include <stdio.h>
#include <stdlib.h>

#define SIZE 5
int stack[SIZE], top=-1;

void push();
void pop();
void disp();

void main() {
    int i, choice;

    // initialize all values of stack
    for (i=0; i<SIZE; i++) {
        stack[i] = 0;
    }
    do {
        printf("\n Enter choice");
        printf("\n 1: PUSH 1 value");
        printf("\n 2: POP 1 value");
        printf("\n 3: exit \n");
        scanf("%d",&choice);
        
          choice == 1? push()    
        : choice == 2? pop()
        : exit(0);

        disp();
    } while(1);
}

void push() {
    int value;
    if (top == SIZE-1) {
        printf("Overflow");
        exit(1);
    }
    // no need for else because program exits if condition met 
    printf("Enter numeric value to push ");
    scanf("%d", &value);
    top++;
    stack[top] = value;
}

void pop() {
    int temp;
    if (top == -1) {
        printf("Underflow");
        exit(1);
    }

    // no need for else because program exits if condition met 
    temp = stack[top];
    printf("The popped value is %d \n", temp);
    stack[top] = 0;
    top--;
}

void disp() {
    // displays current stack values 
    int i;
    printf("Index \t Value");
    for (i=SIZE-1; i>=0; i--) {
        printf("\n %d \t %d",i ,stack[i]);
        if (i==top) printf("\t <--- TOP");
    }
}