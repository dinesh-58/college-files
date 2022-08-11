// 10

#include <stdio.h>
void main() {
  int i, n = 5, input;
  FILE *f_even, *f_odd, *f_dat;
  f_even = fopen("even.txt", "w");
  f_odd = fopen("odd.txt", "w");
  f_dat = fopen("odd.dat", "w+");

  printf("Enter %d numbers", n);
  for (i = 0; i < n; i++) {
    scanf("%d", &input);
    if (input % 2 == 0)
      fprintf(f_even, "%d ", input);
    else
      fprintf(f_odd, "%d ", input);
  }

  fclose(f_even);
  fclose(f_odd);
  fclose(f_dat);
}