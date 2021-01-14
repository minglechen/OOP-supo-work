package supo3.Question53;

public class Row implements Comparable<Row>{
    private int x;
    private int y;
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Row(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public int compareTo(Row o) {
        int comp = Integer.compare(getX(), o.getX());
        if (comp != 0) return comp;
        return Integer.compare(getY(), o.getY());
    }
}
