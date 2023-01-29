#include <stdio.h>
#include <stdlib.h>

#define N 5
int queue[N], max=N-1, front=-1, rear=-1;

int increment(int index) {
    if (index == max) return 0;
    else return index+1;
}
void display_queue() {
    int i;
    printf("\n Current status of circular queue:");
    printf("\n Index \t Value");
    for (i=0; i<N; i++) {
        printf("\n %d \t %d",i ,queue[i]);
        if (i == front) printf("\t <--- Front");
        if (i == rear) printf("\t <--- Rear");
    }
}
void enqueue() {
    int new_item;
    if (increment(rear) == front) {
        // display_queue();  //just for testing. remove later
        printf("\n Overflow");
        exit(1);
    } 
    printf("Enter new item to add to queue");
    scanf("%d",&new_item);
    if (front == -1) front++;
    rear = increment(rear);
    queue[rear] = new_item;
}
void dequeue() {
        queue[front] = 0;
        if (front == rear) {
            // display_queue();     //just for testing. remove later
            printf("\n Queue is empty now");
            exit(0);
        }
        front = increment(front);
}
void main() {
    char choice; 
    int i; 
    // initialize queue
    for (i=0;i<N;i++) {
        queue[i] = 0;
    }
    while (1) {
        printf("\n 1: Enqueue");
        printf("\n 2: Dequeue");
        printf("\n Press anything else to exit");
        printf("\n Enter choice ");
        scanf(" %c",&choice);

          choice == '1'? enqueue(), display_queue()
        : choice == '2'? dequeue(), display_queue()
        : exit(0);    
    }
}