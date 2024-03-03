public class BSTnode
{
    int data;
    BSTnode leftChild;
    BSTnode rightChild;

    public BSTnode (int data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data -> "+data;
    }
}
