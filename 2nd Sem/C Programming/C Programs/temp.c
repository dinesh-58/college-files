// 7
// input ages using DMA. count ages between 18 & 25

#include <stdio.h>
#include <stdlib.h>

void main() {
  int i, n = 5, count = 0, *p;
  p = malloc(n * sizeof(int));
  printf("Enter ages");
  for (i = 0; i < n; i++) {
    scanf("%d", &p[i]);
    if (p[i] >= 18 && p[i] <= 25) count++;
  }
  printf("There are %d ages between 18 & 25", count);
  free(p);
}