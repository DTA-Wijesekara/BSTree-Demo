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
        return data + " , ";
    }

    //to find the inorder successor to shift when deleting a two child node
    public int minValue()
    {
        if (this.leftChild == null)
        {
            return this.data;
        }
        else
        {
            return this.leftChild.minValue();
        }
    }

    public boolean remove (int data ,BSTnode parent)
    {
        if (data<this.data)
        {
            if (this.leftChild != null)
            {
                return this.leftChild.remove(data,this);
            }
            else
            {
                return false;
            }
        }
        else if (data>this.data)
        {
            if (this.rightChild != null)
            {
                return this.rightChild.remove(data,this);
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (this.leftChild != null && this.rightChild != null)
            {
                this.data = this.rightChild.minValue();
                this.rightChild.remove(this.data,this);
            }
            else if (parent.leftChild == this)
            {
                parent.leftChild = (this.leftChild==null) ? this.rightChild : this.leftChild;
            }
            else if (parent.rightChild == this)
            {
                parent.rightChild = (this.leftChild==null) ? this.rightChild : this.leftChild;
            }
        }
        return true;
    }
}
