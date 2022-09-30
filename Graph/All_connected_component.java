package DSA.Graph;
import java.util.*;

import DSA.OOPs.student;
public class All_connected_component {

    public static void printHelper(int edges[][] , boolean visited[] , ArrayList<Integer> arr , int sv){
        visited[sv] = true; 
        arr.add(sv);
         int n = edges.length; 
         for(int j = 0 ; j < n ; j++){
            if(edges[sv][j]  == 1 && !visited[j]){
                printHelper(edges, visited, arr, j);
            }
         }
    }

    public static void BFS(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        // ArrayList<ArrayList<Integer>> arraylist = new ArrayList<>();
        // checking if the i is visited or not to for another graph 
        for(int i = 0; i < edges.length; i++){
            if(!visited[i]){
                ArrayList<Integer> arrans = new ArrayList<Integer>();
                printHelper(edges , visited , arrans , i);
                Collections.sort(arrans);
                for(int j = 0 ; j < arrans.size(); j++){
                        System.out.print(arrans.get(j) + " ");
                        System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int n ; 
        int e; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        e = sc.nextInt();
        int edges[][] = new int[n][n]; 
        for(int i = 0; i < e; i++){
            int fv = sc.nextInt(); 
            int sv = sc.nextInt(); 
            edges[fv][sv] = 1;
            edges[sv][fv] = 1; 

        }
        BFS(edges);

    }
}
