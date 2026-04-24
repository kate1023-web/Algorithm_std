#include<stdio.h>

int main () {
	int x, n, pay;
	pay=0;
	scanf("%d", &x);
	scanf("%d", &n);
	for(int i=1; i <= n; ++i) {
		int a, b;
		scanf("%d %d", &a, &b);
		pay=pay+(a*b);
	}
	if( x == pay) {
		printf("Yes");
	}
	else {
		printf("No");
	}
}