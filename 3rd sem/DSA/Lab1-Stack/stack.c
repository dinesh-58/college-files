#include <stdio.h>
#include <stdlib.h>

void main() {
    int n=5, stack[n], i, value, choice, top=-1;
    for (i=0; i<n; i++) {
        stack[i] = 0;
    }
    do {
        printf("\n Enter choice");
        printf("\n 1: PUSH 1 value");
        printf("\n 2: POP 1 value");
        printf("\n 3: exit \n");
        scanf("%d",&choice);

        if (choice == 1) { // PUSH
            if (top == n-1) {
                printf("Overflow");
                exit(1);
            } 
            printf("Enter numeric value to push");
            scanf("%d", &value);
            top++;
            stack[top] = value;
        }    
        else if (choice == 2) { // POP
            if (top == -1) {
                printf("Underflow");
                exit(1);
            }
            stack[top] = 0;
            top--;
        }
        else exit(0);
        // display current Stack status  
        printf("Index \t Value");
        for (i=n-1; i>=0; i--) {
            printf("\n %d \t %d",i ,stack[i]);
            if (i==top) printf("\t <--- TOP");
        }
    } while(1);
}
