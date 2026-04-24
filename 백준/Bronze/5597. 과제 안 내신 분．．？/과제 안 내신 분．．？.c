#include<stdio.h>

int main () {
	int arr[29];
	int count[31];
	for(int i=1; i<29; ++i) {
		scanf("%d", &arr[i]);
	}
	for(int i=1; i<31; ++i) {
		count[i]=0;
	}
	for(int i=1; i<29; ++i) {
		count[arr[i]]=1;
	}
	for(int i=1; i<31; ++i) {
		if ( count[i] != 1) {
			printf("%d\n", i);
		}
	}
}