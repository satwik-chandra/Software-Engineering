import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Satwik Chandra
 *
 */
public class LowestCommonAncestorTest {

	
	@Test
	public void testNonExisting() {

		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);


		assertEquals("Should return -1 for non existing entries in tree.findLCA(0,0)",-1,tree.findLCA(0,0));
	}


	
	@Test
	public void testCorrectResult() {

		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);


		assertEquals("Should return 2 for non existing entries in tree.findLCA(4,5)",2,tree.findLCA(4,5));
		assertEquals("Should return 1 for non existing entries in tree.findLCA(4,6)",1,tree.findLCA(4,6));
		assertEquals("Should return 1 for non existing entries in tree.findLCA(0,0)",1,tree.findLCA(3,4));
		assertEquals("Should return 2 for non existing entries in tree.findLCA(0,0)",2,tree.findLCA(2,4));
		assertEquals("Should return 4 for non existing entries in tree.findLCA(0,0)",4,tree.findLCA(8,9));
	}



	@Test
	public void testDuplicateValues() {

		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);


		assertEquals("Should return 1 for non existing entries in tree.findLCA(1,1)",1,tree.findLCA(1,1));
		assertEquals("Should return 2 for non existing entries in tree.findLCA(2,2)",2,tree.findLCA(2,2));
		assertEquals("Should return 3 for non existing entries in tree.findLCA(3,3)",3,tree.findLCA(3,3));
		assertEquals("Should return 4 for non existing entries in tree.findLCA(4,4)",4,tree.findLCA(4,4));
		assertEquals("Should return 5 for non existing entries in tree.findLCA(5,5)",5,tree.findLCA(5,5));
	}


	@Test
	public void testZeroNull() {

		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);


		assertEquals("Should return 0 for non existing entries in tree.findLCA(0,0)",0,tree.findLCA(0,0));
		assertEquals("Should return 0 for non existing entries in tree.findLCA(0,2)",0,tree.findLCA(0,2));
		assertEquals("Should return 0 for non existing entries in tree.findLCA(3,0)",0,tree.findLCA(3,0));
		
	}


}
