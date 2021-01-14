package supo3.Question50;

public class point implements Comparable<point>{

    private final int x;
    private final int y;
    private final int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(point o) {
        int compz = Integer.compare(getZ(),o.getZ());
        if (compz != 0) return compz;
        int compy = Integer.compare(getY(),o.getY());
        if (compy != 0) return compy;
        return Integer.compare(getX(),o.getX());
    }
}
