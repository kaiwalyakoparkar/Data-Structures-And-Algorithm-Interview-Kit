package DetectCycleInDirectedGraph;
import java.util.*;

public class Solution{
	public static class Graph{
		private LinkedList<Integer> adj[];

		public Graph(int vertices){
			//Defining length of main linkedlist
			adj = new LinkedList[vertices];
			for(int i = 0; i < vertices; i++){
				//Adding new linked list to every element of main linkedlst
				adj[i] = new LinkedList<Integer>();
			}
		}

		public void addEdge(int source, int destination){
			adj[source].add(destination);
			adj[destination].add(source);
		}

		public boolean dfsStack(int source, int destination){
			
		}
	}

	//Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(Sytem.in);
	}
}