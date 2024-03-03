public class BSTree
{
    BSTnode root;
    public void addNode(int data)
    {
        BSTnode newNode = new BSTnode(data);
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            BSTnode currentNode = root;
            while (true)
            {
                BSTnode parentNode = currentNode;
                if (newNode.data < currentNode.data)
                {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null)
                    {
                        parentNode.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null)
                    {
                        parentNode.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }
    public void preOrderTraversal(BSTnode currentNode)
    {
        System.out.println(currentNode.toString());
        preOrderTraversal(currentNode.leftChild);
        preOrderTraversal(currentNode.rightChild);
    }
}
