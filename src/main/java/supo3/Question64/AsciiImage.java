package supo3.Question64;

public class AsciiImage {
    private final StringBuilder stringBuilder;


    private final int width;
    private final int height;

    public AsciiImage() {
        width = 8;
        height = 8;
        stringBuilder = new StringBuilder();
        for(int i=0; i<64; i++){
            if (i % width == 0 && i != 0) stringBuilder.append(System.lineSeparator());
            stringBuilder.append('-');
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    void draw(int x, int y, char c, Rule rule){
        int[] dx = new int[]{-1,0,1,-1,1,-1,0,1};
        int[] dy = new int[]{-1,-1,-1,0,0,1,1,1};
        if (rule.getFrame() != null){
            for (int i = 0; i < 8; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX < 0 || newX >= width || newY < 0 || newY >= width) continue;
                stringBuilder.setCharAt(newX+ newY * (width + System.lineSeparator().length()), rule.getFrame());
            }
        }
        stringBuilder.setCharAt(x + y * (width + System.lineSeparator().length()),c);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
