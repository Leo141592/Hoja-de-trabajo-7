import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearchFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));
        tree.insert(new Association<>("house", "casa"));

        Association<String, String> result = tree.search(new Association<>("dog", ""));

        assertNotNull(result);
        assertEquals("perro", result.getValue());
    }

    @Test
    public void testSearchNotFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));

        Association<String, String> result = tree.search(new Association<>("car", ""));

        assertNull(result);
    }

    @Test
    public void testInsertOrderBST() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("mango", "mango"));
        tree.insert(new Association<>("apple", "manzana"));
        tree.insert(new Association<>("zebra", "cebra"));

        // Verifica que todos existen
        assertNotNull(tree.search(new Association<>("mango", "")));
        assertNotNull(tree.search(new Association<>("apple", "")));
        assertNotNull(tree.search(new Association<>("zebra", "")));
    }

    @Test
    public void testDuplicateInsert() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("dog", "perro"));

        Association<String, String> result = tree.search(new Association<>("dog", ""));

        assertNotNull(result);
        assertEquals("perro", result.getValue());
    }
}