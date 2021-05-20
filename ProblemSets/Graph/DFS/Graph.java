package Graph.DFS;
import java.util.*;

public class Graph{
    //Creating a private LinkedList
    private LinkedList<Integer> adj[];

    //Creating a adjacency list
    public Graph(int vertices){
        //Making the LinkedList of vertices's size
        adj = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    //Linking the edges in the adjacency list
    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    //================== DFS Function =========================

    public boolean dfsStack(int source, int destination){
        //Creating a boolean array for keeping track of visited
        boolean visited[] = new boolean[adj.length];
        visited[source] = true; //Making the source visite at first
        Stack<Integer> stack = new Stack<>();

        stack.push(source);//adding source to the stack

        while(!stack.isEmpty()){
            int curr = stack.pop();

            //If the curr comes to destination then don't go ahead
            if(curr == destination) return true;

            /*Traversing and adding every neighbour node of curr in
            adjacency list*/
            for(int neighborNode : adj[curr]){
                /*
                1. Visiting the nodes which are not visited before
                2. Marking them as visited and pushing them into stack
                */
                if(!visited[neighborNode]){
                    visited[neighborNode] = true;
                    stack.push(neighborNode);
                }
            }
        }

        return false;
    }

    //=========================================================

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the vertices and edges");
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        //Creating the adjacency list of the length of the vertices
        Graph graph = new Graph(vertices);

        System.out.println("Enter the "+edges+" edges");

        for (int i = 0; i < edges; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            //Chaining each other in the adjacency list
            graph.addEdge(node1, node2);
        }

        System.out.println("Enter the source and the destination node:");
        int source = sc.nextInt();
        int destination = sc.nextInt();

        System.out.println("Possible path "+dfsStack(source, destination));
    }
}
