#include<stdio.h>

int main () {
	int arr[10];
	int big, bn;
	for(int i=1; i<=9; ++i) {
		scanf("%d", &arr[i]);
	}
	big=arr[0];
	bn=0;
	for(int i=1; i<=9; ++i) {
		if (arr[i] > big) {
			big=arr[i];
			bn=i;
		}
	}
	printf("%d\n%d", big, bn);
}