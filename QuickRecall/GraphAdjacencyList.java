
package QuickRecall;
import java.util.*;

public class GraphAdjacencyList{
    LinkedList<Integer> adj[];
    void GraphAdjacecyList(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v ; i++){
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of vertices: ");
        int v = sc.nextInt();
        GraphAdjacencyList g = new GraphAdjacencyList(v);
        System.out.println("Enter the no. of edges: ");
        int e = sc.nextInt();

        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int e1 = sc.nextInt();
            g.addEdge(v1,e1);
        }
    }
}
