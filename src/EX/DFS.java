package EX;

public class DFS {
    // dfs, 재귀, 인접 행렬, i 정점부터 시작한다.
    public static void dfs(int i) {
        visit[i] = true;
        System.out.print(i + " ");

        for(int j=1; j<n+1; j++) {
            if(map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
    }
}
