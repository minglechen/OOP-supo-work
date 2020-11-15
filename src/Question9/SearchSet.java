package Question9;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet(){
        mHead = null;
        mElements = 0;
    }

    public void insert(int n){
        mElements++;

        if (mHead == null){
            mHead = new BinaryTreeNode(n);
            return;
        }
        BinaryTreeNode current = mHead;
        while (true) {
            if (n == current.getValue()) {
                throw new IllegalArgumentException();
            } else if (n > current.getValue()) {
                BinaryTreeNode next = current.getRight();
                if (next == null) {
                    current.setRight(new BinaryTreeNode(n));
                    break;
                }
                current = next;
            } else {
                BinaryTreeNode next = current.getLeft();
                if (next == null) {
                    current.setLeft(new BinaryTreeNode(n));
                    break;
                }
                current = next;
            }

        }
    }

    public int getNumberElements(){
        return mElements;
    }

    public boolean contains(int n){
        BinaryTreeNode current = mHead;
        while (current != null){
            if (n == current.getValue()){
                return true;
            } else if (n > current.getValue()){
                current = current.getRight();
            } else {
                current = current.getLeft();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchSet a = new SearchSet();
        a.insert(5);
        a.insert(2);
        a.insert(7);
        System.out.println(a.contains(7));

        FunctionalArray b =new FunctionalArray(5);
        b.set(0,1);
        b.set(1,2);
        b.set(2,3);
        b.set(3,4);
        b.set(4,5);

        for(int i = 0; i< 5; i++){
            System.out.println(b.get(i));
        }
    }


}
