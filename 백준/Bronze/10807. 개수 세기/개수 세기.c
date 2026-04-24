#include<stdio.h>

int main () {
	int N,n, count;
	count=0;
	int arr[101];
	scanf("%d", &N);
	for(int i=1; i<=N; ++i) {
		scanf("%d", &arr[i]);
	}
	scanf("%d", &n);
	for(int i=1; i<=N; ++i) {
		if (arr[i] == n) {
			count++;
		}
	}
	printf("%d", count);
}