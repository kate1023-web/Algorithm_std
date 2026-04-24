#include<stdio.h>

int main () {
	int a, b, c, m, t;
	scanf("%d %d %d", &a, &b, &c);
	if ( a == b && b == c && a ==c) {
		m=10000+(a*1000);
	}
	else if (a == b && b != c ) {
		m=1000+(a*100);
	}
	else if (a != b && b == c) {
		m=1000+(b*100);
	}
	else if (a == c && b != c) {
		m=1000+(a*100);
	}
	else if (a != b && b != c && a != c) {
		if (a > b) {
			t=a;
			a=b;
			b=t;
		}
		if ( b > c) {
			t=b;
			b=c;
			c=t;
		}
		m=c*100;
	}
	printf("%d", m);
}