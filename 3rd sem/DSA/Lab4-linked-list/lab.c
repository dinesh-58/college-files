#include <stdio.h>
#include <stdlib.h>

struct node {
    int info;
    struct node * link; 
} *first, *ptr, *cpt;

void create () {
    char ch;
    ptr = (struct node *) malloc(sizeof(struct node));
    printf("enter 1st info");
    scanf("%d", &ptr->info);
    first = ptr;
    ptr->link = cpt;
    do {
        cpt = (struct node *) malloc(sizeof(struct node));
        printf("Enter next info");
        scanf("%d", &cpt->info);
        ptr->link = cpt;
        printf("Enter y for entering more info");
        scanf(" %c", &ch);
    } while (ch == 'y');
    cpt->link = NULL;
}

void traverse () {
    printf("\n Traversing within list \n");
    ptr = first; 
    while (ptr != NULL) {
        printf("%d \t", ptr->info);
        ptr = ptr->link;
    }
}

void insert_beginning() {
    cpt = (struct node *) malloc(sizeof(struct node));
    if (cpt ==  NULL) {
        printf("Overflow");
        exit(1);
    }

    printf("Enter data");
    scanf(" %d", &cpt->info);
    cpt->link = first;
    first = cpt;
}

void insert_end() {
    cpt = (struct node *) malloc(sizeof(struct node));
    if (cpt ==  NULL) {
        printf("Overflow");
        exit(1);
    }

    printf("Enter data");
    scanf("%d", &cpt->info);
    do {
    ptr = first;
        ptr = ptr->link;
    } while (ptr->link != NULL); 
    ptr->link = cpt;
    cpt->link = NULL;
}
void main () {
    char ch;
    create();
    traverse();

    printf("\n 1: Insert at beginning");
    printf("\n 2: Insert at end");
    printf("\n Enter choice");
    scanf(" %c", &ch);

      ch == '1'? insert_beginning(), traverse()
    : ch == '2'? insert_end(), traverse()   
    : exit(0);
}
 