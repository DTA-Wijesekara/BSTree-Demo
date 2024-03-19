public class BSTree
{
    BSTnode root;
    public boolean remove(int data)
    {
        if (root == null)
        {
            return false;
        }
        if (root.leftChild==null)
        {
            root=root.rightChild;
        }
        else if (root.rightChild==null)
        {
            root=root.leftChild;
        }
        return root.remove(data,null);
    }
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
    public void addNodetype2(int data)
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
                if (newNode.data < currentNode.data)
                {
                    if (currentNode.leftChild == null)
                    {
                        currentNode.leftChild=newNode;
                        return;
                    }
                    else
                    {
                        currentNode = currentNode.leftChild;
                    }
                }
                else
                {
                    if (currentNode.rightChild == null)
                    {
                        currentNode.rightChild=newNode;
                        return;
                    }
                    else
                    {
                        currentNode = currentNode.rightChild;
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
