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
        if (currentNode == null)
        {
            return;
        }
        System.out.print(currentNode.toString());
        preOrderTraversal(currentNode.leftChild);
        preOrderTraversal(currentNode.rightChild);
    }
    public void postOrderTraversal(BSTnode currentNode)
    {
        if (currentNode == null)
        {
            return;
        }
        postOrderTraversal(currentNode.leftChild);
        postOrderTraversal(currentNode.rightChild);
        System.out.print(currentNode.toString());
    }
    public void inOrderTraversal(BSTnode currentNode)
    {
        if (currentNode == null)
        {
            return;
        }
        inOrderTraversal(currentNode.leftChild);
        System.out.print(currentNode.toString());
        inOrderTraversal(currentNode.rightChild);
    }
    public BSTnode findNode (int data)
    {
        BSTnode currentNode = root;
        while(currentNode != null)
        {
            if (data == currentNode.data)
            {
                return currentNode;
            }
            else
            {
                if (data < currentNode.data)
                {
                    currentNode = currentNode.leftChild;
                }
                else
                {
                    currentNode = currentNode.rightChild;
                }
            }
        }
        return null;
    }
}
