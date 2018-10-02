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
		
		assertEquals("LCA of 2 & 3: ", 1, fiveNodes.findLCA(2,3));
		assertEquals("LCA of 2 & 4: ", 2, fiveNodes.findLCA(2,4));
		assertEquals("LCA of 2 & 5: ", 2, fiveNodes.findLCA(2,5));
		assertEquals("LCA of 3 & 4: ", 1, fiveNodes.findLCA(3,4));
		assertEquals("LCA of 3 & 5: ", 1, fiveNodes.findLCA(3,5));
		assertEquals("LCA of 4 & 5: ", 2, fiveNodes.findLCA(4,5));
	}
	
	//Test3 for node size equaling 12
	@Test
	public void test3(){
		LCA twelveNodes = new LCA();
		twelveNodes.root = new Node(1);
		twelveNodes.root.left = new Node(2);
		twelveNodes.root.right = new Node(3);
		twelveNodes.root.left.left = new Node(4);
		twelveNodes.root.left.right = new Node(5);
		twelveNodes.root.right.left = new Node(6);
		twelveNodes.root.right.right = new Node(7);
		twelveNodes.root.left.left.left = new Node(8);
		twelveNodes.root.left.left.right = new Node(9);
		twelveNodes.root.left.right.left = new Node(10);
		twelveNodes.root.left.right.right = new Node(11);
		twelveNodes.root.right.left.left = new Node(12);
		
		assertEquals("LCA of 2 & 3: ", 1, twelveNodes.findLCA(2,3));
		assertEquals("LCA of 2 & 4: ", 2, twelveNodes.findLCA(2,4));
		assertEquals("LCA of 2 & 5: ", 2, twelveNodes.findLCA(2,5));
		assertEquals("LCA of 3 & 4: ", 1, twelveNodes.findLCA(3,4));
		assertEquals("LCA of 3 & 5: ", 1, twelveNodes.findLCA(3,5));
		assertEquals("LCA of 4 & 5: ", 2, twelveNodes.findLCA(4,5));
		assertEquals("LCA of 4 & 7: ", 1, twelveNodes.findLCA(4,7));
		assertEquals("LCA of 8 & 9: ", 4, twelveNodes.findLCA(8,9));
		assertEquals("LCA of 5 & 8: ", 2, twelveNodes.findLCA(5,8));
		assertEquals("LCA of 9 & 10: ", 2, twelveNodes.findLCA(9,10));
		assertEquals("LCA of 11 & 12: ", 1, twelveNodes.findLCA(11,12));
	}
	

	//Test4 for non existent nodes
	@Test
	public void test4(){
		LCA nonExistentNode = new LCA();
		nonExistentNode.root = new Node(1);
		nonExistentNode.root.left = new Node(2);
		nonExistentNode.root.right = new Node(3);
		nonExistentNode.root.left.left = new Node(4);
		nonExistentNode.root.left.right = new Node(5);
		nonExistentNode.root.right.left = new Node(6);
		nonExistentNode.root.right.right = new Node(7);
		nonExistentNode.root.left.left.left = new Node(8);
		nonExistentNode.root.left.left.right = new Node(9);
		nonExistentNode.root.left.right.left = new Node(10);
		
		//Ancestry node that does not exist
		assertEquals("LCA of 11 & 12: ", -1, nonExistentNode.findLCA(11,12));
		assertEquals("LCA of 22 & 32: ", -1, nonExistentNode.findLCA(22,32));
		assertEquals("LCA of 100 & 2: ", -1, nonExistentNode.findLCA(100,2));
	}
	
	
	//Test5 will test when node of ancestor of another number
	@Test
	public void test5(){
		LCA ancestorNode = new LCA();
		ancestorNode.root = new Node(44);
		ancestorNode.root.left = new Node(72);
		ancestorNode.root.right = new Node(39);
		ancestorNode.root.left.left = new Node(3);
		ancestorNode.root.left.right = new Node(11);
		ancestorNode.root.right.left = new Node(99);
		ancestorNode.root.right.right = new Node(1);
		
		assertEquals("LCA of 72 & 39: ", 44, ancestorNode.findLCA(72,39));
		assertEquals("LCA of 3 & 1: ", 44, ancestorNode.findLCA(3,1));
		assertEquals("LCA of 99 & 1: ", 39, ancestorNode.findLCA(99,1));
		assertEquals("LCA of 72 & 11: ", 72, ancestorNode.findLCA(72,11));
		assertEquals("LCA of 72 & 99: ", 44, ancestorNode.findLCA(72,99));
		//Test 5 failure
	}
}
 