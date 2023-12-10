package DSA.Graph;
import java.util.ArrayList;
import java.util.Scanner;

public class Get_Path_By_DFS {
    // getting path by DFS
    public static ArrayList<Integer> getPathDFS(int edges[][] , boolean visited[] , int V1 , int V2){
        if(V1 == V2){
            ArrayList<Integer> ans = new ArrayList<>();
            visited[V1] = true;
            ans.add(V1);
            return ans;
        }
        visited[V1] = true;
        for(int i = 0 ; i < edges.length; i++){
            if(edges[V1][i] == 1 && !visited[i]){
                ArrayList<Integer> arr = getPathDFS(edges, visited, i, V2);
                if(arr != null){
                    arr.add(V1);
                }
            }
        }
        return null;
    }
    // main function 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertex : ");
        int n = sc.nextInt();
        System.out.print("Enter the edges : ");
        int e = sc.nextInt();
        int edges[][] = new int[n][n];
        for(int i = 0; i < e; i++){
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1; 
            edges[sv][fv] = 1;  
        }
        int V1=sc.nextInt();
        int V2=sc.nextInt();
        boolean visited[]=new boolean[n];
        ArrayList<Integer> ans=getPathDFS(edges,visited,V1,V2);
        if(ans!=null){
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        }
    }
}
