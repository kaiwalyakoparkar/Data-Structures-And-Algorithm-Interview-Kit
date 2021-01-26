//Graph Adj Matrix
package QuickRecall;
import java.util.*;

public class GraphAdjMatrix{
    int vertex;
    int matrix[][];
    public GraphAdjMatrix(int vertex){
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }
    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }
    public void display(){
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the no. of vertex: ");
        int v = sc.nextInt();
        GraphAdjMatrix graph = new GraphAdjMatrix(v);
        System.out.println("Enter the no of edges: ");
        int e = sc.nextInt();
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int e1 = sc.nextInt();
            graph.addEdge(v1, e1);
        }

        graph.display();
    }
}
