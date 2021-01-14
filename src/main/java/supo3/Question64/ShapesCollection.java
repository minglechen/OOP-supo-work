package supo3.Question64;

import java.util.Arrays;
import java.util.List;

public class ShapesCollection implements Drawable{
    public List<Drawable> shapes;
    public ShapesCollection(Drawable... shapes) {
        this.shapes = Arrays.asList(shapes.clone());
    }

    @Override
    public void draw(AsciiImage asciiImage, Rule rule) {
        for (Drawable s : shapes){
            s.draw(asciiImage, rule);
        }
    }
}
