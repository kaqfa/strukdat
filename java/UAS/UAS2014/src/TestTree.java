/**
 *
 * @author kaqfa
 */
public class TestTree {
    Tree t = new Tree();
    
    public TestTree(){
        this.fillData();
    }
    
    public void fillData(){
        t.insert(50);
        t.insert(25);
        t.insert(75);
        t.insert(20);
        t.insert(45);
        t.insert(67);
        t.insert(84);
        t.insert(94);
        t.insert(35);
        t.insert(58);
        t.insert(69);
        t.insert(77);
        t.insert(24);
        t.insert(15);
        t.insert(82);
        t.insert(22);
        t.insert(29);
        t.insert(48);
        t.insert(57);
        t.insert(99);
        t.insert(86);
    }
    
    public static void main(String[] args) {
        TestTree demo = new TestTree();        
    }
}
