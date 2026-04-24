#include<stdio.h>

int main () {
	int a, n, ln, rn, count, a2;
	count=ln=rn=0;
	scanf("%d", &a);
	n=a;
	do {
		ln=n/10;
		rn=n%10;
		n=ln+rn;
		n=n%10+rn*10;
		count++;
	} while ( a != n);
	printf("%d", count);
}