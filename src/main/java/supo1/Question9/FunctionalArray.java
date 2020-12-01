package supo1.Question9;

public class FunctionalArray {
    private BinaryTreeNode mHead;

    public FunctionalArray(int size){
        mHead = new BinaryTreeNode(0);
        for (int i = 0; i < size; i++){
            set(i, 0);
        }

    }

    public void set(int index, int value){
        if (index == 0){
            mHead.setValue(value);
            return;
        }
        BinaryTreeNode current = mHead;
        while (index!= 0 && index != 1 && index != 2){
            index /= 2;
            if (index %2 != 0){
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        if (current == null) throw new IndexOutOfBoundsException();
        if(index %2 != 0){
            if (current.getLeft() == null){
                current.setLeft(new BinaryTreeNode(value));
            }
            current.getLeft().setValue(value);
        } else {
            if (current.getRight() == null){
                current.setRight(new BinaryTreeNode(value));
            }
            current.getRight().setValue(value);
        }


    }

    public int get(int index){
        if (index == 0){
           return mHead.getValue();
        }
        BinaryTreeNode current = mHead;
        while (index!= 0 && index != 1 && index != 2){
            if (index %2 != 0){
                index /= 2;
                current = current.getLeft();
            } else {
                index /= 2;
                current = current.getRight();
            }
        }
        if(index %2 != 0){
            if (current.getLeft() == null){
               throw new IndexOutOfBoundsException();
            }
            return current.getLeft().getValue();
        } else {
            if (current.getRight() == null){
                throw new IndexOutOfBoundsException();
            }
            return current.getRight().getValue();
        }
    }
}
