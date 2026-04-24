import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {0,1,0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int[][] num;
	static boolean vis[][];
	static int n, m;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		num = new int[n][m];
		vis = new boolean[n][m];
		for(int i=0;i<n; ++i) {
			st = new StringTokenizer(bf.readLine());
			String line = st.nextToken();
			for(int j=0; j<m; ++j) {
				num[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		BFS(0,0);
		System.out.println(num[n-1][m-1]);
	}
	
	public static void BFS(int s, int e) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {s, e}); //?
		vis[s][e] = true;
		while(!q.isEmpty()) {
			int now[] = q.poll();
			for(int i=0; i<4; ++i) { //상하좌우 비교라 4
				int x = now[0] + dx[i];
				int y = now[1] + dy[i];
				if(x>=0 && y>=0 && x<n && y<m) {
					if(num[x][y] != 0 && !vis[x][y]) {
						vis[x][y] = true;
						num[x][y] = num[now[0]][now[1]]+1;
						q.add(new int[] {x, y});
					}
				}
			}
		}
	}
}
