import java.util.*;

public class Experiment {

    public void runTest(Graph g) {
        long start;
        long end;

        start = System.nanoTime();
        g.bfs(0);
        end = System.nanoTime();
        System.out.println("BFS Time: " + (end - start));

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();
        System.out.println("DFS Time: " + (end - start));

        System.out.println("--------------------");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};
        Random r = new Random();

        for (int size : sizes) {
            System.out.println("Graph Size: " + size);

            Graph g = new Graph(size);

            for (int i = 0; i < size * 2; i++) {
                int from = r.nextInt(size);
                int to = r.nextInt(size);
                g.addEdge(from, to);
            }

            runTest(g);
        }
    }

    public void printResults() {
        System.out.println("Experiment Finished");
    }
}