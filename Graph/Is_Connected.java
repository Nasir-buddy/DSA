package DSA.Graph;
import java.util.*;

import DSA.Strings.shotcut;
public class Is_Connected {
    public static boolean isConnected(int edges[][] , int sv){
        if(edges.length == 0){
            return true;
        }
        boolean visited[] = new boolean[edges.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv] = true;
        while(!q.isEmpty()){
            int front = q.peek();
            q.poll();
            for(int i = 0 ; i < edges.length; i++){
                if(!visited[i] && edges[front][i] == 1){
                    q.add(i);
                    visited[i]= true;
                }
            }
        }
        for(boolean i : visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ; 
        int e; 
        n = sc.nextInt();
        e = sc.nextInt();
        int edges[][] = new int[n][n];
        for(int i = 0 ; i < e; i++){
            int fv = sc.nextInt(); 
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1; 

        }
        boolean ans = isConnected(edges , 0);
        System.out.println(ans);
    }
}
