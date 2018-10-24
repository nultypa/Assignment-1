import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

 public class DAGTest {
 	
	//Test that DAG works correctly
 	@Test
 	public void test1()
 	{
 		DAG test = new DAG(10);
 		test.addEdge(1, 2);
 		test.addEdge(1, 3);
 		test.addEdge(3, 4);
 		test.addEdge(4, 5);
 		test.addEdge(4, 6);
 		
 		assertEquals("", 1, test.indegreeV(4));
 		assertEquals("", 2, test.outdegree(4));
 		assertEquals("", 5, test.numE());
 		assertEquals("", 10, test.numV());
 		String ans = "[5, 6]";
 		assertEquals("",ans, test.adj(4).toString());
 	}
 	
 	//Test for out degree
	@Test
	public void test2()
	{
		DAG out = new DAG(5);
		out.addEdge(0, 1);
		out.addEdge(0, 2);
		out.addEdge(1, 2);
		
		assertEquals("", -1, out.outdegree(8));	
		assertEquals("", 2, out.outdegree(0));	
		assertEquals("", 0, out.outdegree(2));
	}
 	
 	//Test for indegree
	@Test
	public void test3()
	{
		DAG in = new DAG(5);
		in.addEdge(0, 1);
		in.addEdge(0, 2);
		in.addEdge(1, 2);
		
		assertEquals("", -1, in.indegreeV(-3));
		assertEquals("", 1, in.indegreeV(1));
		assertEquals("", 2, in.indegreeV(2));
	}
 	
 	//Test for adding edges
 	@Test
 	public void test4()
 	{
 		DAG add = new DAG(5);
		add.addEdge(3, 9);
		add.addEdge(-2, -5);	
 	} 	
 	
 	//Test for cycle
 	@Test
 	public void test5(){
		DAG cyclical = new DAG(20);
		cyclical.addEdge(0, 1);
		cyclical.addEdge(1, 2);
		cyclical.addEdge(2, 0);
		cyclical.addEdge(2, 3);
		cyclical.addEdge(3, 4);
		cyclical.findCycle(0);
		assertTrue(cyclical.cycle());
	}
	
 	//Test for acyclic graph
	@Test
	public void test6(){
			DAG acyclic = new DAG(5);
			acyclic.addEdge(0, 1);
			acyclic.addEdge(1, 2);
			acyclic.addEdge(2, 3);
			assertFalse(acyclic.cycle());
	}
	//Test LCA
	@Test
	public void test7(){
 		DAG lca = new DAG(19);
 		lca.addEdge(0, 1);
 		lca.addEdge(0, 2);
 		lca.addEdge(1, 3);
 		lca.addEdge(1, 4);
 		lca.addEdge(2, 5);
 		lca.addEdge(3, 6);
 		lca.addEdge(4, 6);
 		lca.addEdge(5, 6);
 		lca.addEdge(6, 7);
 		lca.addEdge(2, 8); 		
 		lca.addEdge(7, 9);
 		lca.addEdge(8, 9);
 		
 		assertEquals("", 0, lca.findLCA(1, 2));
 		assertEquals("", 2, lca.findLCA(8, 6));
 		assertEquals("", 8, lca.findLCA(9, 8));
	}
	@Test
	//Test for no common ancestor
 	public void test8(){
 		DAG lca = new DAG(11);
 		lca.addEdge(0, 1);
 		lca.addEdge(1, 2);
 		lca.addEdge(1, 3);
 		lca.addEdge(2, 4);
 		lca.addEdge(3, 4);
 		lca.addEdge(2, 5);
 		lca.addEdge(4, 5);
 		
 		//Common ancestor
 		assertEquals("", 1, lca.findLCA(3, 1));
 		assertEquals("", 1, lca.findLCA(3, 2));
 		
 		//No common ancestor
 		assertEquals("", -1, lca.findLCA(7, 0));
 		assertEquals("", -1, lca.findLCA(11, 10));
 	}
	 
	//Test for non DAG
	@Test
	public void test9(){
		DAG lca = new DAG(11);
		lca.addEdge(0, 1);
		lca.addEdge(0, 2);
		lca.addEdge(2, 3);
		lca.addEdge(3, 0);
		lca.addEdge(3, 4);
		
		assertEquals("", -1, lca.findLCA(2, 3));
		assertEquals("", -1, lca.findLCA(3, 4));
		assertEquals("", -1, lca.findLCA(1, 2));
		assertEquals("", -1, lca.findLCA(0, 3));
		assertEquals("", -1, lca.findLCA(1, 3));
	}
	//Test for empty DAG
	@Test
	public void test10(){
		DAG lca = new DAG(3);
		assertEquals("", -1, lca.findLCA(0, 0));
		assertEquals("", -1, lca.findLCA(0, 7));
		assertEquals("", -1, lca.findLCA(0, 9));
	}
	//Test LCA for same vertex
	@Test
	public void test11(){
		DAG lca = new DAG(15);
		lca.addEdge(0, 1);
		lca.addEdge(1, 2);
		lca.addEdge(1, 3);
		lca.addEdge(2, 3);
		
		assertEquals("", 2, lca.findLCA(2, 2));
	}
 }