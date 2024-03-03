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
}
