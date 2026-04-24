#include<stdio.h>

int main () {
	int x, y, z, n1, n2, n;
	scanf("%d", &n1);
	scanf("%d", &n2);
	z=n2%10;
	y=(n2%100-z)/10;
	x=(n2%1000-(y*10+z))/100;
	printf("%d\n%d\n%d\n%d", n1*z, n1*y, n1*x, n1*n2);
}