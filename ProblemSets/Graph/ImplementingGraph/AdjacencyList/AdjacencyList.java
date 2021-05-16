package ImplementingGraph.AdjacencyList;
import java.util.*;

public class AdjacencyList{

    public static class AdjList{
        public class Edge{
            int v, w;
            public Edge(int v, int w){
                this.v = v;
                this.w = w;
            }

            @Override
            public String toString(){
                return ("( "+v+" , "+w+" )");
            }
        }

        List<Edge> G[];
        public AdjList(int n){
            G = new LinkedList[n];
            for(int i = 0; i < G.length; i++){
                G[i] = new LinkedList<Edge>();
            }
        }

        boolean isConnected (int u, int v){
            for(Edge i : G[u])
                if(i.v == v)return true;
            return false;
        }

        void addEdge(int u, int v, int w){
            G[u].add(0, new Edge(v,w));
        }

        @Override
        public String toString(){
            String result = " ";
            for(int i = 0; i < G.length; i++){
                result += i + "=>" + G[i] + "\n";
            }
            return result;
        }
    }

    //Main class
    public static void main(String args[]){
        AdjList g = new AdjList(10);
        g.addEdge(0,2,10);
        g.addEdge(0,5,15);
        g.addEdge(2,5,10);
        g.addEdge(9,3,16);

        System.out.println(g);
        System.out.println(g.isConnected(9,3));
    }
}
