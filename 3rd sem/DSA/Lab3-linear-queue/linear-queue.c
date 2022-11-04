// linear queue

#include <stdio.h>
#include <stdlib.h>

#define SIZE 3
int queue[SIZE], front = -1, rear = -1;

void display_queue() {
    int i;
    printf("\n Current status of queue:");
    printf("\n Index \t Value");
    for (i=front; i<=rear; i++) {
        printf("\n %d \t %d",i ,queue[i]);
        if (i == front) printf("\t <--- Front");
        if (i == rear) printf("\t <--- Rear");
    }
}

void enqueue() {
    int new_item;
    if (front == -1) front++;
    if (rear == SIZE-1) {
        printf("Overflow. Stack full\n");
        exit(1);
    }
    printf("Enter data to add to queue ");
    scanf("%d", &new_item);
    queue[++rear] = new_item;
}

void dequeue() {
    if (front == -1 || front > rear) {
        printf("Underflow. Stack empty\n");
        exit(1);
    }
    queue[front++] = 0;
}

void main() {
    int choice; 
    while (1) {
        printf("\n 1: Enqueue");
        printf("\n 2: Dequeue");
        printf("\n Press anything else to exit");
        printf("\n Enter choice ");
        scanf(" %d",&choice);

          choice == 1? enqueue(), display_queue()
        : choice == 2? dequeue(), display_queue()
        : exit(0);    
    }
}