#include<stdio.h>

int main() {
	int tc, cnt1, sum;
	cnt1=sum=0;
	char arr[81];
	scanf("%d", &tc);
	for(int i=1; i <=tc; ++i) {
		scanf("%s", arr);
		for(int j=0; j<strlen(arr); ++j) {
			if (arr[j] == 'O') {
				cnt1++;
				sum=sum+cnt1;	
			}
			else if (arr[j] == 'X') {
				cnt1=0;
			}
			
		}
		printf("%d\n", sum);
		cnt1=0;
		sum=0;
	}
}