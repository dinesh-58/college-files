#include <SDL2/SDL_bgi.h>
#include <stdio.h>
#include <math.h>

int main() {
    int gd=DETECT, gm;
    float x, y, x1, y1, x2, y2, dx, dy, steps, xinc, yinc, k;
    printf("Enter x1, y1, x2, y2 ");
    scanf("%f %f %f %f", &x1, &y1, &x2, &y2);  // note: take input outside graphics mode

    dx = x2 - x1;
    dy = y2 - y1;
    steps = fabsf(dx) > fabsf(dy) ? fabsf(dx) : fabsf(dy);
    xinc = dx / steps;
    yinc = dy / steps;
    x = x1;
    y = y1;
    k = 0;

    initgraph(&gd, &gm, NULL);
    for(k=0; k<= steps; k++) {
        putpixel(roundf(x), roundf(y), WHITE);
        x += xinc;
        y += yinc;
        delay(100);
    } 
    getch();
    closegraph();
    return 0;
}
