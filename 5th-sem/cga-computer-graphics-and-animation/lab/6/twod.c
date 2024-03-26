#include <stdio.h>
#include <graphics.h>
// #include <conio.h>

int main() {
	int gd=DETECT, gm;
	int i, j, k, x_1, y_1, x_2, y_2, x1, x2, y1, y2, X, Y;

	float CM[3][3] = {
		1, 0, 50,
		0, 1, 0,
		0, 0, 1
	};
	// could probably get rid of x1, y1, ... variables
	x1=0, y1=0, x2=50, y2=50;
	float Points[3][2] = {
		x1, y1,
		x2, y2,
		1 , 1
	};
	float Points_new[3][2];

	// initgraph(&gd, &gm, "C://turboc3/bgi");
	initgraph(&gd, &gm, NULL);
	X = getmaxx();
	Y = getmaxy();

	for(i=0; i<3; i++) {
		for(j=0; j<2; j++) {
			Points_new[i][j] = 0;
			for(k=0; k<3; k++) {
				Points_new[i][j] += CM[i][k] * Points[k][j];
			}
		}
	}
	// store transformed coordinates
	x_1 = Points_new[0][0];
	y_1 = Points_new[1][0];
	x_2 = Points_new[0][1];
	y_2 = Points_new[1][1];

	setcolor(RED);
	// axes
	line(0, Y/2, X, Y/2);
	line(X/2, 0, X/2, Y);

	// initial shape. addition done to plot relative to Origin
	setcolor(15);
	line(x1 + X/2, y1 + Y/2, x2 + X/2, y2 + Y/2);

	// transformed shape
	setcolor(1);
	line(x_1 + X/2, y_1 + Y/2, x_2 + X/2, y_2 + Y/2);

	getch();
	closegraph();
    return 0;
}
