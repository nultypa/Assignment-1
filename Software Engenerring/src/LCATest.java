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
	
	//Test3 for node size equaling 12
	@Test
	public void test3(){
		LCA sixteenNodes = new LCA();
		sixteenNodes.root = new Node(1);
		sixteenNodes.root.left = new Node(2);
		sixteenNodes.root.right = new Node(3);
		sixteenNodes.root.left.left = new Node(4);
		sixteenNodes.root.left.right = new Node(5);
		sixteenNodes.root.right.left = new Node(6);
		sixteenNodes.root.right.right = new Node(7);
		sixteenNodes.root.left.left.left = new Node(8);
		sixteenNodes.root.left.left.right = new Node(9);
		sixteenNodes.root.left.right.left = new Node(10);
		sixteenNodes.root.left.right.right = new Node(11);
		sixteenNodes.root.right.left.left = new Node(12);
		
		assertEquals("LCA of of 2 & 3: ", 1, sixteenNodes.findLCA(2,3));
		assertEquals("LCA of of 2 & 4: ", 2, sixteenNodes.findLCA(2,4));
		assertEquals("LCA of of 2 & 5: ", 2, sixteenNodes.findLCA(2,5));
		assertEquals("LCA of of 3 & 4: ", 1, sixteenNodes.findLCA(3,4));
		assertEquals("LCA of of 3 & 5: ", 1, sixteenNodes.findLCA(3,5));
		assertEquals("LCA of of 4 & 5: ", 2, sixteenNodes.findLCA(4,5));
		assertEquals("LCA of of 4 & 7: ", 1, sixteenNodes.findLCA(4,7));
		assertEquals("LCA of of 8 & 9: ", 4, sixteenNodes.findLCA(8,9));
		assertEquals("LCA of of 5 & 8: ", 2, sixteenNodes.findLCA(5,8));
		assertEquals("LCA of of 9 & 10: ", 2, sixteenNodes.findLCA(9,10));
		assertEquals("LCA of of 11 & 12: ", 1, sixteenNodes.findLCA(11,12));
	}
}
 