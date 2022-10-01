package DSA.Graph.GraphAlgo;

import java.util.*;

class Edge implements Comparable<Edge> {
    int source;
    int destination;
    int weight;

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

}

public class Kruskal_Algorithm {

    public static int findParent(int vertex, int parent[]) {
        // we checking the parent if the parent is same by traversing on array then we
        // return that index value
        if (parent[vertex] == vertex) {
            return vertex;
        }
        return findParent(parent[vertex], parent);
    }

    public static void kruskals_Algo(Edge input[], int n) {
        Arrays.sort(input);

        Edge output[] = new Edge[n - 1];

        int parent[] = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int count = 0;
        int i = 0;
        while (count != n - 1) {
            Edge currentEdge = input[i];

            int sourceParent = findParent(currentEdge.source, parent);
            int destinationParent = findParent(currentEdge.destination, parent);

            if (sourceParent != destinationParent) {
                output[count] = currentEdge;
                count++;
                // now we making any of onw child and parent
                parent[sourceParent] = destinationParent;

            }
            // i represent that which edge we are working now
            i++;
        }
        System.out.println("printing our Result.....");
        for(int j = 0 ; j < n - 1; j++){
            if(output[j].source < output[j].destination){
            System.out.println(output[j].source + " "  + output[j].destination + " " + output[j].weight);
            } else {
                System.out.println(output[j].destination + " "  + output[j].source + " " + output[j].weight);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int E = sc.nextInt();

        // making E size array which store null by default....we have to intitailize and
        // we have to call the constructor....
        Edge input[] = new Edge[E];

        for (int i = 0; i < E; i++) {
            input[i] = new Edge();
            input[i].source = sc.nextInt();
            input[i].destination = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        kruskals_Algo(input, n);
    }
}
