import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	//Test 0 tests for an empty tree
	@Test
	public void test0() {
		LCA emptyTree = new LCA();
		assertEquals("LCA(empty",-1,emptyTree.findLCA(0,0));
	}
	
	@Test
	public void test1(){
		
	}

}
