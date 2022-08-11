/*prints even numbers from 20 to 30; 
was trying to see if there was a =+ operator similar to += addition assignment operator*/
#include <stdio.h>
void main()
{
    int a=20;
    printf("%d",a);
    while (a<30){
        a+=2;           //Turns out C doesn't have an =+ operator
        printf("\n %d",a);
    }
}