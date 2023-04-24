package EX;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // bfs, q사용, 인접행렬, i 정점부터 시작한다.
    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] = true;

        while(!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int j=1; j<n+1; j++) {
                if(map[temp][j] == 1 && visit[j] == false) {
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }
}
