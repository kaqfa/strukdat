/**
 *
 * @author kaqfa
 */
public class TestTreeGenap {             
    
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(20);
        tree.insert(45);
        tree.insert(67);
        tree.insert(84);
        tree.insert(94);
        tree.insert(35);
        tree.insert(58);
        tree.insert(69);
        tree.insert(77);
        tree.insert(24);
        tree.insert(15);
        tree.insert(82);
        tree.insert(22);
        tree.insert(29);
        tree.insert(48);
        tree.insert(57);
        tree.insert(99);
        tree.insert(86);
        
        tree.doOperation("print-all");
    }
}