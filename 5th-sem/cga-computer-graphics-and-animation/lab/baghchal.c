#include <SDL2/SDL_bgi.h>
#include <stdio.h>
#include <graphics.h>

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);
    int x=getmaxx(), y=getmaxy();

    rectangle(0,0,x,y);
    line(0,0,x,y);

    line(x/4,0,x/4,y);

    line(x/2,0,x/2,y);
    line(x/2,0,0,y/2);
    line(x/2,0,x,y/2);

    line(3*x/4,0,3*x/4,y);

    line(x,0,0,y);

    line(0,y/4,x,y/4);

    line(0,y/2,x,y/2);
    line(0,y/2,x/2,y);
    line(x,y/2,x/2,y);

    line(0,3*y/4,x,3*y/4);

    getch();
    closegraph();
}
