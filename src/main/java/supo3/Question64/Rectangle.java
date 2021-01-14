package supo3.Question64;

public class Rectangle extends Shape implements Drawable{
    private final int x;
    private final int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public void draw(AsciiImage asciiImage) {
//        asciiImage.draw(x,'#');
//    }
    @Override
    public void draw(AsciiImage asciiImage, Rule rule) {
        asciiImage.draw(x,y,'#', rule);
    }
}
