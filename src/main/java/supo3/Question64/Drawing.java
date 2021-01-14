package supo3.Question64;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    public static void draw(Drawable shapes, Rule rule){
        AsciiImage asciiImage = new AsciiImage();
        shapes.draw(asciiImage, rule);


        System.out.println(asciiImage);
    }
    public static void main(String[] args) {
        ShapesCollection collection = new ShapesCollection(new Circle(0,0), new Rectangle(2,2));
        ShapesCollection collection1 = new ShapesCollection(collection, new Circle(5,5));
        draw(collection, Rule.noFrame());
        draw(collection, Rule.plusFrame());
        draw(collection1, Rule.xFrame());

    }

}

