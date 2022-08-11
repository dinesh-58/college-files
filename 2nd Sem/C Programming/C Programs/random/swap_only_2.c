//2019 C past paper q no. 3
//swap 2 variables without using 3rd
#include<stdio.h>
void main()
{
  int a, b;
  printf("Enter 2 numbers");
  scanf("%d %d",&a, &b);
  if (a>b) {
    if (b<10) {
      a=a*10+b;
      b=a/10;
      a=a%10;
    }
    else {
      while(b>10)
    }
  }
  if (b>a) {
    if (a<10) {
      b=b*10+a;
      a=a/10;
      b=a%10;
    }
    else {
      while (a>10)
      //store power of 10 as fractional part?
    }
  }
}
