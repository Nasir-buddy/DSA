package DSA.Graph.GraphAlgo;

import java.util.*;

public class Dijkstra_Algorithm {
    private static void dijkstra_algorithm(int adjacencyMatrix[][]) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v - 1; i++){
            // Find Vertex with min distance 
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            //Explore neighbors
            for(int j = 0 ; j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MIN_VALUE){
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                     }
                }
            }
        }
        //Print the matrix 
        for(int i = 0; i < v ; i++){
            System.out.println(i + " " + distance[i]);
        }
    }
    private static int findMinVertex(int distance[] , boolean visited[]){
        int minVertex = -1; 
        for(int i = 0; i < distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        int adjacencyMatrix[][] = new int[V][V];
        for (int i = 0; i < E; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjacencyMatrix[v1][v2] = weight;
            adjacencyMatrix[v2][v1] = weight;
        }
        dijkstra_algorithm(adjacencyMatrix);
    }

}