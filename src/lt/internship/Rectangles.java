package lt.internship;

public class Rectangles implements RectanglesInterface{
    RectangleBuilder rectangleBuilder = new RectangleBuilder();
    public String draw(int width, int height) {
        if(width <= 1 || height <= 1) {
            return "Incorrect values. Please enter values higher than 1.";
        }
        try {
            return rectangleBuilder.build(width,height);
        }
        catch (RuntimeException e) {
            throw new UnsupportedOperationException();
        }
    }
}