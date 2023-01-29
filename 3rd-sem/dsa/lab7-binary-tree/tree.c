#include <stdio.h>
#include <stdlib.h>
typedef struct bin {
    int data;
    struct bin * left;
    struct bin * right;
} node; //typedef makes it so using node is same as using struct bin 

void insert(node *, node *);
void inorder(node *);
void preorder(node *);
void postorder(node *);

void main() {
    int ch;
    char ans;
    node *newn, *root;
    root = NULL;

    do {
        printf("\n Program for implementing simple binary tree");
        printf("\n 1. Create");
        printf("\n 2. Inorder traversal");
        printf("\n 3. Pre-order traversal");
        printf("\n 4. Post-order traversal");
        printf("\n 5. Exit");
        printf("\n Enter your choice");
        scanf(" %d",&ch);
        
        switch (ch)
        {
        case 1:
            // ! put this in separate create() function, call it only once without user choice
            root = NULL;
            do {
                newn = (node *) malloc(sizeof(node));
                printf("Insert data");
                scanf(" %d", &newn->data);
                newn->left=NULL;
                newn->right=NULL;

                if(root == NULL) root = newn;
                else insert(root, newn);

                printf("\n Do you want to enter more elements? <y/n>");
                scanf(" %c", &ans);
            } while (ans == 'y' || ans == 'Y');
            break;

        case 2:
            if (root == NULL) {
                printf("Tree has not yet been created");
                // TODO check if this breaks & goes into another loop
                break;
            }
            inorder(root);
            break;
        case 3:
            if (root == NULL) {
                printf("Tree has not yet been created");
                // TODO check if this breaks & goes into another loop
                break;
            }
            preorder(root);
            break;
        case 4:
            if (root == NULL) {
                printf("Tree has not yet been created");
                // TODO check if this breaks & goes into another loop
                break;
            }
            postorder(root);
            break;
        default:
            exit(0); 
        }
    } while(1);
}

void insert(node * root, node * newn) {
    if(newn->data < root->data) {
        // if less, move left
        if (root->left == NULL)  root->left = newn;
        else insert(root->left, newn);
    }
    else {
        // if less, move right
        if (root->right == NULL) root->right = newn;
        else insert(root->right, newn);        
    }
}
void inorder(node * temp) {
    if(temp != NULL) {
        inorder(temp->left);
        printf("%d \t", temp->data);
        inorder(temp->right);
    }
}
void preorder(node * temp) {
    if(temp != NULL) {
        printf("%d \t", temp->data);
        preorder(temp->left);
        preorder(temp->right);
    }

}
void postorder(node * temp) {
    if(temp != NULL) {
        postorder(temp->left);
        postorder(temp->right);
        printf("%d \t", temp->data);
    }

}