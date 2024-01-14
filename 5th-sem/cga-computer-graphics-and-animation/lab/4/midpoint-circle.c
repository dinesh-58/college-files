// separate function for 8-point symmetry?
#include <SDL2/SDL_bgi.h>
#include <stdio.h>
#include <graphics.h>

void plotEightPoints(int x, int y, int xc, int yc);

int main() {
    int xc, yc, r, x, y, p;
    int gd = DETECT, gm;
    printf("Enter xc, yc and r ");
    scanf("%d %d %d", &xc, &yc, &r);

    x = 0;
    y = r;
    p = 1 -r;  // p_0
    initgraph(&gd, &gm, NULL);
    while(y >= x) {
        plotEightPoints(x, y, xc, yc);    
        if(p > 0) {
            p += 2*x - 2*y + 5;
            y--;
        } else p += 2*x + 3;
        x++;
    }
    getch();
    closegraph();
    return 0;
}

void plotEightPoints(int x, int y, int xc, int yc) {
    // perform 8-point symmetry and center translation
    /* NOTE: can be optimized w/ binary addition?
     * 00, 01, 10, 11 where 1 represents -ve sign
    */
    putpixel( x + xc,  y + yc, 8);
    putpixel( x + xc, -y + yc, 1);
    putpixel(-x + xc,  y + yc, 2);
    putpixel(-x + xc, -y + yc, 3);
    putpixel( y + xc,  x + yc, 4);
    putpixel( y + xc, -x + yc, 5);
    putpixel(-y + xc,  x + yc, 6);
    putpixel(-y + xc, -x + yc, 7);

    delay(50);
}
