#include<stdio.h>

int main () {
	int h, m;
	scanf("%d %d", &h, &m);
	if ( m >= 45) {
		m=m-45;
		printf("%d %d", h, m);
	}
	else if ( m < 45) {
		h=h-1;
		m=m+15;
		if ( h < 0) {
			h=h+24;
		}
		printf("%d %d", h, m);
	}
}