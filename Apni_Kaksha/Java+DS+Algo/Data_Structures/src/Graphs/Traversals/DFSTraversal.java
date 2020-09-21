/*
 * 
 *@author: Kaiwalya Koparkar
 *@date: 21/ 09/ 2020
 *@resource: www.geeksforgeeks.com 
 * 
 */
package Graphs.Traversals;
//Java program to print DFS traversal from a given given graph 
import java.util.*; 

//This class represents a directed graph using adjacency list 
//representation 
class DFSTraversal 
{ 
	private int V; // No. of vertices 

	// Array of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[]; 

	// Constructor 
	DFSTraversal(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	//Function to add an edge into the graph 
	void addEdge(int v, int w) 
	{ 
		adj[v].add(w); // Add w to v's list. 
	} 

	// A function used by DFS 
	void DFSUtil(int v,boolean visited[]) 
	{ 
		// Mark the current node as visited and print it 
		visited[v] = true; 
		System.out.print(v+" "); 

		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> i = adj[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFSUtil(n, visited); 
		} 
	} 

	// The function to do DFS traversal. It uses recursive DFSUtil() 
	void DFS(int v) 
	{ 
		// Mark all the vertices as not visited(set as 
		// false by default in java) 
		boolean visited[] = new boolean[V]; 

		// Call the recursive helper function to print DFS traversal 
		DFSUtil(v, visited); 
	} 

	public static void main(String args[]) 
	{ 
		DFSTraversal dfsg = new DFSTraversal(4); 

		dfsg.addEdge(0, 1); 
		dfsg.addEdge(0, 2); 
		dfsg.addEdge(1, 2); 
		dfsg.addEdge(2, 0); 
		dfsg.addEdge(2, 3); 
		dfsg.addEdge(3, 3); 

		System.out.println("Following is Depth First Traversal "+ 
						"(starting from vertex 2)"); 

		dfsg.DFS(2); 
	} 
} 
 
