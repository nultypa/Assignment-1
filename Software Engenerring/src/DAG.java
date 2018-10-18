import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DAG {

	private int numE;                 
	private int numV;           
	private ArrayList<Integer>[] adj;    
	private int[] indegreeV;        
	private boolean marked[];		
	private boolean cycle;		    
	private boolean ordV[];	
	
	public DAG(int numV)
	{
		if (numV < 0) throw new IllegalArgumentException("A Digraph must have a nonnegative number of vertices");
	    this.numV = numV;
	    this.numE = 0;
	    indegreeV = new int[numV];
	    marked = new boolean[numV];
	    ordV = new boolean[numV];
	    adj = (ArrayList<Integer>[]) new ArrayList[numV];
	    
	    for (int v = 0; v < numV; v++) 
	    {
	    	adj[v] = new ArrayList<Integer>(); 
	    }
	}
	
	public int numE()
	{
		return numE;
	}
	
	public int numV()
	{
		return numV;
	}
	
	private int validateV(int v) 
	{
        if (v < 0 || v >= numV)
        {
        	return -1;
        }
       	else
        	return 1;
    }
	
	public int indegreeV(int v) 
	{
		if(validateV(v)<0){
			return -1;
		}
		else
		{
			return indegreeV[v];
		}
	}
	
	public int outdegree(int v) 
	{
		if(validateV(v)<0)
		{
			return -1;
		}
		else
		{
			return adj[v].size();
		}
	}
	
	public void addEdge(int v, int w)
	{
	    if((validateV(v)>0)&&(validateV(w)>0))
	    {
	    	adj[v].add(w);
	    	indegreeV[w]++;
	    	numE++;
	    }
	    else
	    {
	    	System.out.println("Enter vertices between 0 & n-1");
	    }
	    	
	}
	
	public Iterable<Integer> adj(int v)
	{ 
		return adj[v]; 
	}
	
	public void findCycle(int v) {

        marked[v] = true;
        ordV[v] = true;

        for (int w : adj(v)) {
            if(!marked[w]) 
            {
                findCycle(w);
            } 
            else if (ordV[w]) 
            {
                cycle = true;
                return;
            }
        }
        ordV[v] = false;
    }
	
	public boolean cycle() 
	{
        return cycle;
    }
	
	

}
