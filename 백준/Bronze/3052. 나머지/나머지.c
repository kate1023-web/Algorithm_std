#include<stdio.h>

int main () {
	int arr[11];
	int count[42];
	int cnt=0;
	for(int i=1; i<11; ++i) {
		scanf("%d", &arr[i]);
	}
	for(int i=1; i<42; ++i) {
		count[i]=0;
	}
	for(int i=1; i<11; ++i) {
		count[(arr[i]%42)]++;
	}
	for(int i=0; i<42; ++i) {
		if (count[i] > 0) {
			cnt++;
		}
	}
	printf("%d", cnt);
}