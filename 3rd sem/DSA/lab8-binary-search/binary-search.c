#include<stdio.h>

void main() {
    // Insert & search in array
    char ch;
    int low, high, mid, n, i ,data;
    
    printf("How many elements do you want to enter? ");
    scanf("%d", &n);
    
    int arr[n];
    for(i=0; i<n; i++) {
        printf("Enter data ");
        scanf("%d", &arr[i]);
    }
    
    do {
        printf("Enter data to be searched ");
        scanf("%d", &data);

        low = 0;
        high = n-1;
        mid = (low + high)/2;

        while (data != arr[mid] && low <= high) {
            if (data > arr[mid]) low = mid+1;
            else high = mid-1;
            mid = (low + high)/2;
        }
          data == arr[mid] ? printf("\n %d found at position %d", data, mid+1)
        : printf("\n Data not found");
        printf("\n Do you want to search another number? <y/n> ");
        scanf(" %c", &ch);
    } while (ch=='y' || ch=='Y');
}