package DSA.Graph.GraphAlgo;

import java.util.*;

public class Prism_Algorithm {

    private static int findminVertex(int weight[], boolean visited[]){
        int minVertex = 1;
        for(int i = 0 ; i < weight.length; i++){
            // we check min vertex -1 to avoid array out of bound exception
            if(!visited[i] && (minVertex == - 1 || weight[i] < weight[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }
    private static void prims(int adjacencyMatrix[][]) {
        int v = adjacencyMatrix.length;
        //we storing 3 arrays visited 
        boolean visited[] = new boolean[v];
        // second for the weight
        int weight[] = new int[v];
        //third for the parent of the every vertex..
        int parent[] = new int[v];

        weight[0] = 0;
        parent[0] = -1;
        for(int i = 1; i < v; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v; i++){
            // Pick vertex with minimum weight..
            int minVertex = findminVertex(weight, visited);
            visited[minVertex]  = true;
            // Explore its unvisited neighbors..
            for(int j = 0;  j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j]){
                    if(adjacencyMatrix[minVertex][j] < weight[j]){
                        weight[j] = adjacencyMatrix[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }
        }
        //Print edges of the MST
        System.out.println("Printing the resultant matrix....");
        for(int i = 1; i < v; i++){
            if(parent[i] < i){
                System.out.println(parent[i] + " " + i + " " + weight[i]);
            }else{
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            }
        }
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
        prims(adjacencyMatrix);
    }
}
