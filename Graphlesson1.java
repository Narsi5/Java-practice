import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graphlesson1 {
    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination,int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]  = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2 ,3));

        graph[1].add(new Edge(1,2,4));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,0,8));
        graph[2].add(new Edge(2,1,2));
        graph[2].add(new Edge(2,3,1));

        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,5));
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for(int i = 0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.print(e.destination+" ");
        }
    }
}
