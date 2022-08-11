#include <stdio.h>
void main()
{
    float m,p,c,total;
    printf("Enter marks in maths");
    scanf("%f",&m);
    printf("Enter marks in physics");
    scanf("%f",&p);
    printf("Enter marks in chemistry");
    scanf("%f",&c);
    total=m+p+c;
    if (m>=60)
        {
            if(p>=50)
            {
                if(c>=50)
                {
                    if (total>=200) printf("Admission possible. Congratulations!");
                    else printf("Admission not possible. Sorry \n Reason: Insufficient total marks");
                } else printf("Admission not possible. Sorry \n Reason: Insufficient marks in Chemistry");
            } else printf("Admission not possible. Sorry \n Reason: Insufficient marks in Physics");
        } else printf("Admission not possible. Sorry \n Reason: Insufficient marks in Maths");
}