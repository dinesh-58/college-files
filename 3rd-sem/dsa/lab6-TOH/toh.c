// Tower of Hanoi recursively

#include<stdio.h>
#include<stdlib.h>

void hanoi(int n, char rodFrom, char rodMiddle, char rodTo);
void main() {
    int n = 3;
    hanoi(n, 'A', 'B', 'C');
}

void hanoi(int n, char rodFrom, char rodMiddle, char rodTo) {
    if (n==1) {
        printf("Disk 1 moved from %c to %c \n", rodFrom, rodTo);
        return 0;
    }
    hanoi(n-1, rodFrom, rodTo, rodMiddle); 
    printf("Disk %d moved from %c to %c \n", n, rodFrom, rodTo);
    hanoi(n-1, rodMiddle, rodFrom, rodTo);
}