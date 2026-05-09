import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addVertex(Vertex v) {
    }

    public void addEdge(int from, int to) {
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int n : adjList.get(i)) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : adjList.get(node)) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adjList.get(node)) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    public int getVertices() {
        return vertices;
    }
}