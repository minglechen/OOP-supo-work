package supo1.Question9;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mRight;
    private BinaryTreeNode mLeft;

    public BinaryTreeNode(int n){
        mValue = n;
        mLeft = null;
        mRight = null;
    }

    public int getValue(){
        return mValue;

    }

    public void setValue(int n){
        mValue = n;

    }

    public BinaryTreeNode getLeft(){
        return mLeft;

    }

    public  BinaryTreeNode getRight(){
        return mRight;
    }

    public void setRight(BinaryTreeNode node){
        mRight = node;

    }
    public void setLeft(BinaryTreeNode node){
        mLeft = node;

    }

}
