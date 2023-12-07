#include<stdio.h>
#include<stdlib.h>  // required for NULL constant?
#include<graphics.h>
int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);
    line(0,0,100,100) ;
    ellipse(100,100,0,-70,20,30);
    getch();   // provided by SDL_BGI's graphics.h
    closegraph();
    return 0;
}
