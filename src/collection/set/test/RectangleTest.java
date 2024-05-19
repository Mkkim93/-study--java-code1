package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {

    public static void main(String[] args) {

        Set<Rectangle> rectangleset = new HashSet<Rectangle>();
        rectangleset.add(new Rectangle(10,10));
        rectangleset.add(new Rectangle(20,20));
        rectangleset.add(new Rectangle(20,20));

        for (Rectangle rectangle : rectangleset) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}
