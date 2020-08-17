import java.util.*;
import java.lang.*;
import java.io.*;
public class Graph {
    private int v;
    private List<Integer> g[];

    //constructor to make an array of linked list
    Graph(int v)
    {
        this.v=v;
        g=new List[v];
        for(int i=0;i<v;++i)
        {
            g[i]= (List<Integer>) new LinkedList();
        }
    }

    //method to add edge
    public void addEdge(int v,int w)
    {
        g[v].add(w);
    }

    //printing the graph
    public void display()
    {
        int i,j;
        for(i=0;i<v;i++)
        {
            System.out.println("Nodes attached to vertex "+ i);
            for(j=0;j<g[i].size();j++)
            {
                System.out.print(g[i].get(j)+" ");
            }
        }
    }

    //main method
    public static void main(String[] args)
    {
        Graph g=new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.display();
    }
}