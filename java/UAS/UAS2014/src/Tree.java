
class Tree {

    private Node root;    

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void doOperation(String operation){
        if(operation.equals("print-all") ){
            this.printAll(root);
        } else if(operation.equals("highest-leaf")){
            
        }
    }

    public void printAll(Node curNode) {
        if (curNode != null) {
            System.out.print(curNode.data + " ");
            printAll(curNode.leftChild);
            printAll(curNode.rightChild);
        }
    }
    
    
    /**
     * Fungsi getHighestLeaf adalah fungsi yang digunakan untuk 
     * mencari dan mencetak nilai dari sebuah node yang memiliki
     * nilai tertinggi dalam sebuah Tree
     * */
    int highestNumber;
    public void getHighestLeaf(Node curNode){
        
    }
    
    /**
     * Fungsi countNonLeaf() adalah fungsi untuk menampilkan (print)
     * semua element tree yang bukan merupakan Leaf (daun)
     */
    public void countNonLeaf(Node curNode){
        
    }
    
    /**
     * Fungsi sumDescendant adalah fungsi yang digunakan untuk menghitung
     * semua jumlah dari semua nilai keturunan dari sebuah Node tanpa 
     * tanpa menghitung nilai subroot-nya
     */
    public void sumDescendant(Node root, int curNode){
        
    }
    
    /**
     * Fungsi eventsInSubTree adalah fungsi yang digunakan untuk menampilkan
     * semua node yang memiliki nilai genap dalam subtree
     */
    public void eventsInSubTree(Node curNode, int val){
        
    }
}
