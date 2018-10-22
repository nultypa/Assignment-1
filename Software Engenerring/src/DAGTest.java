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
 	
 	//Test for empty tree
 	@Test
 	public void test2()
 	{
 		
 	}
 	
 	//Test Tree 1 vertex
 	@Test
 	public void test3()
 	{
 		
 	}
 	
 	//Test for non existing vertices
 	@Test
 	public void test4()
 	{
 		
 	} 	
 }