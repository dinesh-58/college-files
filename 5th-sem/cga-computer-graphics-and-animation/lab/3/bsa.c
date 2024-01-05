#include <stdio.h>
#include <SDL2/SDL_bgi.h>

int main() {
    int x1, y1, x2, y2, dx, dy, x, y, step, i, p;
    int gd = DETECT, gm;
    printf("Enter x1, y1, x2, y2 such that x1 < x2 (L-R convention)");
    scanf("%d %d %d %d", &x1, &y1, &x2, &y2);

    dx = x2 - x1; 
    dy = y2 - x1; 

    // step = dx > dy ? dx : dy;
    if (dx > dy) {
        step = dx;
        x = x1;
        y = y1;
        p = 2 * dy - dx;
        initgraph(&gd, &gm, NULL);

        // x1 = getmaxx();
        // y1 = getmaxy();

        putpixel(x, y, WHITE);
        while(i <= step) {
            x++;
            if(p > 0) {
                y++;
                p = 2 * dy - dx;
            } else p = 2 * dy; 
            putpixel(x, y, WHITE);
            i++;
        }
    }

    else if (dx <= dy) {
        step = dy;
        x = x1;
        y = y1;
        p = 2 * dx - dy;
        initgraph(&gd, &gm, NULL);
        putpixel(x, y, WHITE);
        while(i <= step) {
            y++;
            if(p > 0) {
                x++;
                p = 2 * dx - dy;
            } else p = 2 * dx; 
            putpixel(x, y, WHITE);
            i++;
        }
    }
    getch();
    closegraph();
    // printf("x: %d y: %d", x1, y1);
    return 0;
}
