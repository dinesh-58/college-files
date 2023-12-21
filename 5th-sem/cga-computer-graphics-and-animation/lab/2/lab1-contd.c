// continuation of lab 1

#include <SDL2/SDL_bgi.h>
#include <stdio.h>
// #include <graphics.h>

void main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);
    setcolor(RED);  // set border color
    circle(100, 100, 90);
     setfillstyle(SLASH_FILL, GREEN);   // how to fill (pattern, color)
     floodfill(300, 300, RED);    // what object to fill
    getch();
    closegraph();
}
