#include <stdio.h>
#include <stdlib.h>

struct node
{
    int info;
    struct node *lpt;
    struct node *rpt;
} *first;

void create();
void ftraverse();
void insert_beg();
void insert_end();
void insert_given_node();
void delete_given_node();

void main() {
    int ch;
    printf("Doubly linked list creation \n");
    create();
    ftraverse();

    do {
        printf("\n Press \n 1. to insert @ beginning \n 2. to insert @ end");
        printf("\n 3. to insert after given node \n 4. to delete a given node");
        printf("\n 5. to quit \n");
        scanf(" %d", &ch);

          ch == 1 ? insert_beg()  
        : ch == 2 ? insert_end() 
        : ch == 3 ? insert_given_node()
        : ch == 4 ? delete_given_node()
        : exit(0);
        ftraverse();
    } while(1);
}

void create() {
    struct node *ptr, *cpt;
    char ch = 'y';
    ptr = (struct node *) malloc(sizeof(struct node));
    printf("Enter 1st node info ");
    scanf("%d", &ptr->info);
    ptr->lpt = NULL;
    first = ptr;

    // while(ch == 'y' || ch == 'Y') {
    do {
        cpt = (struct node *) malloc(sizeof(struct node));
        printf("Enter next node's info ");
        scanf("%d", &cpt->info);
        ptr->rpt = cpt;
        cpt->lpt = ptr;
        ptr = cpt;
        printf("Press Y/N for more node ");
        scanf(" %c",&ch);        
    } while(ch == 'y' || ch == 'Y'); 
    // } 

    ptr->rpt = NULL; // here, ptr will be last node so rpt is NULL
} 

void ftraverse() {
    struct node *ptr;
    printf("\n Forward traversal \n");
    ptr = first;
    while (ptr != NULL) {
        printf("%d\t", ptr->info);
        ptr = ptr->rpt;
    }
}

void insert_beg() {
    struct node *ptr;
    // ! Could just be a function from here
    ptr = (struct node *) malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("OVERFLOW");
        return;
    }
    // ! till here
    printf("\n Enter new node");
    scanf("%d", &ptr->info);
    ptr->rpt = first;
    first->lpt = ptr;
    first = ptr;
    ptr->lpt = NULL;
    printf("\n New node inserted");
}

void insert_end() {
    struct node *ptr, *cpt;
    ptr = (struct node *) malloc(sizeof(struct node));
    if (ptr == NULL) {
        printf("OVERFLOW");
        return;
    }
    printf("Input new info");
    scanf(" %d", &ptr->info);
    cpt = first;
    while(cpt->rpt != NULL) {
        cpt = cpt->rpt;
    }

    cpt->rpt = ptr;
    ptr->lpt = cpt;
    ptr->rpt = NULL;
    printf("Insertion after end complete");
}
void insert_given_node() {
    struct node *ptr, *cpt, *tpt;
    int m;
    ptr = (struct node *) malloc(sizeof(struct node));
    // ptr is for storing new data
    if (ptr == NULL) {
        printf("OVERFLOW");
        return;
    }
    printf("\n Enter data in linked list after which you want to enter new data ");
    scanf("%d", &m);
    // could just use one line for loop
    for(cpt = first; cpt->rpt != NULL; cpt = cpt->rpt) {
        if(m == cpt->info) break;
    }
    if(m != cpt->info) {
        printf("Data does not exist in the linked list");
        return;
    }
    printf("\n Enter new data ");
    scanf("%d", &ptr->info);
    
    tpt = cpt->rpt;
    cpt->rpt = ptr;
    ptr->lpt = cpt;
    ptr->rpt = tpt;
    tpt->lpt = ptr;
}
void delete_given_node() {
    // TODO free() pointer? look up online
    struct node *ptr, *cpt, *tpt;
    int m;
    printf("\n Enter data in linked list which you want to delete ");
    scanf("%d", &m);
    for(cpt = first; cpt->rpt != NULL; cpt = cpt->rpt) {
        if(m == cpt->info) break;
    }
    if(m != cpt->info) {
        printf("Data does not exist in the linked list");
        return;
    }
    ptr = cpt->lpt;
    tpt = cpt->rpt;
    free(cpt);    
    ptr->rpt = tpt;
    tpt->lpt = ptr;
}
