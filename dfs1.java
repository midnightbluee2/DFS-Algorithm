import java.util.*;

public class dfs1 {
    static boolean[] visited;
    static List<Integer>[] graph;

    static void dfs(int node) {
        // jika node sudah dikunjungi
        visited[node] = true;
        System.out.print(" " + node);

        // jika node belum dikunjungi maka dilakukan rekursi
        for (int i = 0; i < graph[node].size(); i++) {
            int tetangga = graph[node].get(i);
            if (!visited[tetangga]) {
                dfs(tetangga);
            }
        }
    }

    public static void main(String[] args) {
        int n = 9; 
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        // Tambahkan edge
        graph[1].add(2);
        graph[2].add(1);

        graph[1].add(3);
        graph[3].add(1);

        graph[2].add(4);
        graph[4].add(2);

        graph[2].add(5);
        graph[5].add(2);

        graph[3].add(6);
        graph[6].add(3);

        graph[3].add(7);
        graph[7].add(3);

        graph[4].add(8);
        graph[8].add(4);

        graph[5].add(8);
        graph[8].add(5);

        graph[6].add(8);
        graph[8].add(6);

        graph[7].add(8);
        graph[8].add(7);

        visited = new boolean[n];

        //dimulai dari node 1
        dfs(1);
    }
}
