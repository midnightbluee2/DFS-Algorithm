import java.util.*;

public class dfs2 {
    static boolean[] visited; 
    static List<Integer>[] graph; 

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " "); 

        // Telusuri semua tetangga node ini
        for (int tetangga : graph[node]) {
            if (!visited[tetangga]) { 
                dfs(tetangga); // Rekursi ke node paling dalam
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;

        @SuppressWarnings("unchecked")
        List<Integer>[] temp = new ArrayList[n];
        graph = temp;
        
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        // Tambahkan edge sesuai gambar
        graph[1].add(2);
        graph[1].add(3);

        graph[2].add(3);
        graph[2].add(4);
        graph[2].add(5);
        graph[2].add(8);

        graph[3].add(6);
        graph[3].add(7);
        graph[3].add(8);

        graph[6].add(8);

        graph[8].add(4);
        graph[8].add(5);
        graph[8].add(7);

        visited = new boolean[n];

        dfs(1); // Mulai dari simpul 1
    }
}
