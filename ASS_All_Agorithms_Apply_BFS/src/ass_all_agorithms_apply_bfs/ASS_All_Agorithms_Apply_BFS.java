
package ass_all_agorithms_apply_bfs;

import java.util.*;

 class ASS_All_Agorithms_Apply_BFS {
    
    public static void main(String[] args) {
          Graph graph = new Graph(5); // Create a graph with 5 vertices
        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        System.out.println("BFS starting from vertex 0:");
        graph.BFS(0); // Starting BFS from vertex 0
    }
}
