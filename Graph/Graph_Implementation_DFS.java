package DSA.Graph;

import java.util.Scanner;

public class Graph_ImplementationMT {
    public static void printHelper(int edges[][], int sv, boolean visited[]) {
        System.out.print(sv);
        visited[sv] = true;
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                printHelper(edges, i, visited);
            }
        }
    }

    public static void print(int edges[][]) {
        boolean visited[] = new boolean[edges.length];
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
        System.out.println("enter the vertices ");
        n = sc.nextInt();
        System.out.println("Enter the edges ");
        e = sc.nextInt();

        int edges[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        print(edges);
    }
}
