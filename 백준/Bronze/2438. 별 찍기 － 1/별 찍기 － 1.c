#include<stdio.h>

int main () {
	int n, c;
	c=1;
	scanf("%d", &n);
	for(int i=1; i <= n; ++i) {
		while( c <= i) {
			printf("*");
			c++;
		}
		c=1;
		printf("\n");
	}
}