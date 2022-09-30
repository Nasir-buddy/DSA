package DSA.Graph;

import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Get_path_BFS {
    public static ArrayList<Integer> getPathBFS(int edges[][] , boolean visited[] , int V1 , int V2 ){
        if(V1 == V2){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(V1);
            visited[V1] = true;
            return ans;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(V1);
        visited[V1] = true;
        while(!q.isEmpty()){
            int first = q.remove();
            for(int i = 0 ; i < edges.length; i++){
                if(edges[first][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                    map.put(i, first);
                    if(V1 == V2){
                        ans.add(i);
                        while(!ans.contains(V1)){
                            int b = map.get(i);
                            ans.add(b);
                            i = b;
                        }
                        return ans;
                    }
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        int V1 = sc.nextInt();
        int V2 = sc.nextInt();
        boolean visited [] = new boolean[n];
        ArrayList<Integer> ans = getPathBFS(edges , visited , V1 , V2);
        if (ans != null) {
            for (int elem : ans) {
                System.out.print(elem + " ");

            }
        }
    }
}
