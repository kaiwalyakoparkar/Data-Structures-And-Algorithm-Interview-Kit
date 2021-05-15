package Graph.BFS;
import java.util.*;

public class Solution{

    //This is the graph class
    public static class Graph{
        private int v;
        private LinkedList<Integer> adj[];

        //Creating a constructor
        Graph(int v){
            this.v = v;
            adj = new LinkedList[v];

            //Creting a linked list for every node of a linked list
            for(int i = 0; i < v; ++i){
                adj[i] = new LinkedList<>();
            }
        }

        //Method for adding edge
        void addEdge(int v, int w){
            adj[v].add(w);

        }

        //This method does the Breath First Search Traversal
        void BFS(int s){
            //Creating a boolean array
            boolean visited[] = new boolean[v];

            //Creting a queue
            LinkedList<Integer> queue = new LinkedList<>();

            //Making first passed element as visited and adding it to queue
            visited[s] = true;
            queue.add(s);

            //Running a loop till size of queue become zero
            while(queue.size()!=0){
                //Remove the first element in the queue and print it
                s = queue.poll();
                System.out.println(s);

                //Iterate the list assosiated with sth node (which is just printed above)
                Iterator<Integer> i = adj[s].listIterator();

                //Until the list have elements next go on the loop and
                while(i.hasNext()){
                    int n = i.next();
                    //If the node is not visited then mark it as visited and add it to queue
                    if(!visited[n]){
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    //This is the main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking the number of nodes in the graph
        System.out.println("Enter the number of nodes in the graph : ");
        int numberOfNodes = sc.nextInt();
        Graph g = new Graph(numberOfNodes);

        //Taking the number of the links
        System.out.println("Enter the number of links between the nodes : ");
        int numberOfLinks = sc.nextInt();

        for(int i = 0; i < numberOfLinks; i++){
            System.out.println("Enter the nodes sharing link : ");
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            g.addEdge(node1, node2);
        }

        //Traversing the graph in BFS
        g.BFS(1);
    }
}
