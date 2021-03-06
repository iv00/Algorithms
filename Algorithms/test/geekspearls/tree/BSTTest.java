package geekspearls.tree;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by aliu on 31/07/16.
 */
public class BSTTest {

    @Test
    public void testCreateBST() {
        int values[] = {2, 33, 65 ,10, 8, 21, 4, 6};
        BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }
        bst.dfsInOrder();
    }

    @Test
    public void testFind() {
        int values[] = {2, 33, 65 ,10, 8, 21, 4, 6};
        BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }
        Node found = bst.find(10);
        Assert.assertNotNull(found);
        Assert.assertEquals(found.value, 10);
    }

    @Test
    public void testDelete() {
        int values[] = {20, 10,1,11,2,8,5, 9};
        BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }
        bst.delete(10);
        bst.delete(9);
        bst.delete(20);
        bst.delete(1);
        bst.delete(11);
        bst.delete(2);
//        bst.delete(8);
//        bst.delete(5);
        bst.dfsInOrder();
    }

    @Test
    public void testBfs() {
        int values[] = {20, 10,1,11,2,8,5, 9};
        BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }
        bst.bfs();
    }

}
