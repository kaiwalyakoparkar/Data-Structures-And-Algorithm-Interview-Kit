package ImplementingGraph.AdjacencyMatrix;
import java.util.*;

public class AdjacencyMatrix{

    //Class to implement the entire graph using Adjacency Matrix
    public static class AdjMatrix{
        int vertex;
        int matrix[][];

        //Taking vertex and declaring the martix
        public AdjMatrix(int vertex){
            this.vertex = vertex;
            matrix = new int[vertex][vertex];
        }

        //Adding the edges of the graph to the matrix
        public void addEdge(int source, int destination){
            matrix[source][destination] = 1;
            matrix[destination][source] = 1;
        }

        //Prints the entire Adjacency matrix;
        public void printMatrix(){
            System.out.println("Graph Matrix is : ");
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        //Prints the entire Graph
        public void printGraph(){
            for(int i = 0; i < matrix.length; i++){
                System.out.print("Vertex "+i+" is connected to ==> ");
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j]==1){
                        System.out.print(j+"  ");
                    }
                }
                System.out.println();
            }
        }
    }

    //This is the main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking the no of nodes and passing them to the creation of the matrix
        System.out.println("Enter the number of nodes : ");
        int nodes = sc.nextInt();
        AdjMatrix graph = new AdjMatrix(nodes);

        //Adding the edges of the matrix
        System.out.println("Enter the number of unique connections : ");
        int conn = sc.nextInt();

        for(int i = 0; i < conn; i++){
            System.out.println("Enter source edge and destination edge");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }

        //This will print the adjacency matrix
        graph.printMatrix();

        //This will print the graph. Source node to destination node information
        graph.printGraph();
    }
}
