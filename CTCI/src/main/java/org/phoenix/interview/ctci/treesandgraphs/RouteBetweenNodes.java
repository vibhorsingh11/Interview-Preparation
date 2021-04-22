package org.phoenix.interview.ctci.treesandgraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a directed graph, design an algorithm to find out whether there is a
 * route between two nodes.
 */

public class RouteBetweenNodes {
    public static boolean isRoute(Graph root, int source, int destination) {
        if (root == null) return true;
        // Array to keep track of visited nodes
        boolean[] visited = new boolean[root.adjacencyList.length];
        // Queue to store nodes
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);
        // looping until queue is empty
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            List<Integer> currAdjacencyList = root.adjacencyList[curr];
            for (int node : currAdjacencyList) {
                if (node == destination) {
                    return true;
                }
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        int source = 1;
        int destination = 3;
        System.out.println(isRoute(graph, source, destination));

        source = 3;
        destination = 1;
        System.out.println(isRoute(graph, source, destination));
    }
}
