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
	
	public DAG(int numV){
		if (numV < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
	    this.numV = numV;
	    this.numE = 0;
	    indegreeV = new int[numV];
	    marked = new boolean[numV];
	    ordV = new boolean[numV];
	    adj = (ArrayList<Integer>[]) new ArrayList[numV];
	    for (int v = 0; v < numV; v++) {
	    adj[v] = new ArrayList<Integer>(); 
	    }
	}

}
