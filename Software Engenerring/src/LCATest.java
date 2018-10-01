import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	//Test0 tests for an empty tree
	@Test
	public void test0() {
		LCA emptyTree = new LCA();
		assertEquals("LCA of an empty tree: ",-1,emptyTree.findLCA(0,0));
	}
	
	//Test1 for node size equaling 1
	@Test
	public void test1(){
		LCA oneNode = new LCA();
		oneNode.root = new Node(1);
		assertEquals("LCA of tree with only one node: ",-1,oneNode.findLCA(1,0));
	}
	
	//Test2 for node size equaling 5
	@Test
	public void test2(){
		LCA fiveNodes = new LCA();
		fiveNodes.root = new Node(1);
		fiveNodes.root.left = new Node(2);
		fiveNodes.root.right = new Node(3);
		fiveNodes.root.left.left = new Node(4);
		fiveNodes.root.left.right = new Node(5);
		
		assertEquals("LCA of of 2 & 3: ", 1, fiveNodes.findLCA(2,3));
		assertEquals("LCA of of 2 & 4: ", 2, fiveNodes.findLCA(2,4));
		assertEquals("LCA of of 2 & 5: ", 2, fiveNodes.findLCA(2,5));
		assertEquals("LCA of of 3 & 4: ", 1, fiveNodes.findLCA(3,4));
		assertEquals("LCA of of 3 & 5: ", 1, fiveNodes.findLCA(3,5));
		assertEquals("LCA of of 4 & 5: ", 2, fiveNodes.findLCA(4,5));
	}
}
 