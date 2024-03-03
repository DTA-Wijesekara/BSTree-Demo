public class Main {
    public static void main(String[] args) {
        BSTree t = new BSTree();
        t.addNode(10);
        t.addNode(5);
        t.addNode(3);
        t.addNode(20);
        t.addNode(6);
        t.addNode(15);
        t.addNode(2);
        t.addNode(25);
        t.preOrderTraversal(t.root);
        System.out.println();
        t.postOrderTraversal(t.root);
        System.out.println();
        t.inOrderTraversal(t.root);
        System.out.println("\nfing node :- "+t.findNode(2));
    }
}