import java.util.Scanner;

public class Main {
    static int parent[] = new int[3001];
    static int L[][] = new int[3001][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 부모 배열 초기화
        for (int i = 1; i <= N; i++) {
            parent[i] = -1;
        }

        // 선분 입력 받기
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 4; j++) {
                L[i][j] = sc.nextInt();
            }
            // 이전 선분들과 교차 여부 확인
            for (int j = 1; j < i; j++) {
                if (isCross(L[i][0], L[i][1], L[i][2], L[i][3], L[j][0], L[j][1], L[j][2], L[j][3])) {
                    union(i, j);
                }
            }
        }

        // 그룹 개수와 최대 그룹 크기 계산
        int ans = 0, res = 0;
        for (int i = 1; i <= N; i++) {
            if (parent[i] < 0) {
                ans++;
                res = Math.min(res, parent[i]);
            }
        }

        System.out.println(ans);  // 그룹 개수
        System.out.println(-res); // 최대 그룹 크기
    }

    // 부모를 찾는 함수 (Path Compression)
    private static int find(int i) {
        if (parent[i] < 0) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    // 두 선분을 합치는 함수 (Union by Size)
    private static void union(int i, int j) {
        int p = find(i);
        int q = find(j);
        if (p == q) return;
        parent[p] += parent[q];
        parent[q] = p;
    }

    // CCW 계산 함수
    static int CCW(long x1, long y1, long x2, long y2, long x3, long y3) {
        long temp = (x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3);
        if (temp > 0) return 1;
        else if (temp < 0) return -1;
        return 0;
    }

    // 선분이 겹치는지 확인하는 함수
    private static boolean isOverlab(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
        return Math.min(x1, x2) <= Math.max(x3, x4) && Math.min(x3, x4) <= Math.max(x1, x2) &&
               Math.min(y1, y2) <= Math.max(y3, y4) && Math.min(y3, y4) <= Math.max(y1, y2);
    }

    // 두 선분이 교차하는지 확인하는 함수
    private static boolean isCross(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
        int abc = CCW(x1, y1, x2, y2, x3, y3);
        int abd = CCW(x1, y1, x2, y2, x4, y4);
        int cda = CCW(x3, y3, x4, y4, x1, y1);
        int cdb = CCW(x3, y3, x4, y4, x2, y2);
        if (abc * abd == 0 && cda * cdb == 0) {
            return isOverlab(x1, y1, x2, y2, x3, y3, x4, y4);
        } else if (abc * abd <= 0 && cda * cdb <= 0) {
            return true;
        }
        return false;
    }
}
