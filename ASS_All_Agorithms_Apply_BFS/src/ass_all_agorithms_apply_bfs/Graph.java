
package ass_all_agorithms_apply_bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer> adjList[]; // Adjacency List

    // Constructor
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList();
        }
    }

    // Function to add an edge to the graph
    void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // For undirected graph
    }
    // BFS algorithm
    void BFS(int start) {
        boolean visited[] = new boolean[vertices]; // Track visited vertices
        LinkedList<Integer> queue = new LinkedList<>(); // Queue for BFS
        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Get all adjacent vertices of the dequeued vertex
            Iterator<Integer> iterator = adjList[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int neighbor = iterator.next();
                // If an adjacent vertex has not been visited, mark it visited and enqueue it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
