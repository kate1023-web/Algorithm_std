#include<stdio.h>

int main () {
	int big, small, n;
	scanf("%d", &n);
	int arr[n];
	for(int i=0; i<n; ++i) {
		scanf("%d", &arr[i]);
	}
	big=arr[0];
	small=arr[0];
	for(int i=0; i<n; ++i) {
		if (arr[i] < small) {
			small=arr[i];
		}
		if (arr[i] > big) {
			big=arr[i];
		}
	}
	printf("%d %d", small, big);
}