#include<stdio.h>

int main () {
	int n, c;
	c=1;
	scanf("%d", &n);
	for(int i=1; i <= n; ++i) {
		for(int j=i; j < n; ++j) {
			printf(" ");
		}
		for(int k=i; k <= i; ++k) {
			while ( c <= k) {
				printf("*");
				c++;
			}
			c=1;
		}
		printf("\n");
	}
}