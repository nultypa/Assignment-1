import static org.junit.Assert.assertEquals;

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
 }