#include <stdio.h>

int main () {
	long long a, b, c, count=0, arr[100][100]= {0,0,};
	scanf("%lld", &a);
	for (int i =0; i <a; ++i) {
		scanf("%lld %lld", &b, &c);
		
		for ( int j =b; j<b+10; ++j) {
			for ( int k =c; k<c+10; ++k) {
				arr[j][k]= 1;
				
			}
		}
	}
	for (int i=0; i < 100; ++i) {
		for (int j=0; j < 100; ++j) {
			if (arr[i][j] ==1) {
				count++;
			}
		}
	}
	printf("%lld", count);

}