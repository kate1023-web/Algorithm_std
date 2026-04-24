#include<stdio.h>
#include<stdlib.h>

int main() {
	int c;
	scanf("%d", &c);
	for(int i=0; i < c; ++i) {
		int n;
		double sum, cnt;
		sum=cnt=0;
		scanf("%d", &n);
		int arr[n];
		for (int j=0; j<n; ++j) {
			scanf("%d", &arr[j]);
		}
		for (int j=0; j<n; ++j) {
			sum=sum+arr[j];
		}
		sum=sum/n;
		for (int j=0; j<n; ++j) {
			if (arr[j] > sum) {
				cnt++;
			}
		}
		printf("%.3lf%%\n", (cnt/n)*100);
	}
}