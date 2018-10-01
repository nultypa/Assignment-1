import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	//Test0 tests for an empty tree
	@Test
	public void test0() {
		LCA emptyTree = new LCA();
		assertEquals("LCA of an empty tree",-1,emptyTree.findLCA(0,0));
	}
	
	//Test1 for node size equaling 1
	@Test
	public void test1(){
		LCA oneNode = new LCA();
		oneNode.root = new Node(1);
		assertEquals("LCA of an tree with one node",-1,oneNode.findLCA(1,0));
	}
	
	//Test2 for node size equaling 5
	@Test
	public void test2(){
		
	}
}
 