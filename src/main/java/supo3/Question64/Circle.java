package supo3.Question64;

public class Circle extends Shape implements Drawable{
    private final int x;
    private final int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public void draw(AsciiImage asciiImage) {
//        asciiImage.draw(x,'o');
//    }

    @Override
    public void draw(AsciiImage asciiImage, Rule rule) {
        asciiImage.draw(x,y,'o',rule);
    }
}
