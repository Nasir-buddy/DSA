package DSA.Graph;

import java.util.Scanner;

import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueUsingLL;

public class Graph_implementation_BFS {
    public static void printHelper(int edges[][], int sv, boolean visited[]) {
        QueueUsingLL<Integer> q = new QueueUsingLL<>();
        q.enqueue(sv);
        int n = edges.length;
        visited[sv] = true;

        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            } catch (QueueEmptyException e) {
                // TODO Auto-generated catch block
                return;
            }
            System.out.println(front);
            for (int i = 0; i < n; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    q.enqueue(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void BFS(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        // checking if the i is visited or not to for another graph 
        for(int i = 0; i < edges.length; i++){
            if(!visited[i]){
                printHelper(edges, i, visited);
            }
        }
    }
    public static void main(String[] args) {
        int n;
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertices : ");
        n = sc.nextInt();
        System.out.print("Enter the egdes : ");
        e = sc.nextInt();

        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;

        }
        System.out.println("BFS");
        BFS(edges);
    }
}
