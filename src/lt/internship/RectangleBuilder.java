package lt.internship;

public class RectangleBuilder implements Builder{
    private RectanglePartBuilder rectanglePartBuilder = new RectanglePartBuilder();

    public String build(int width, int height) {
        String rectangle = rectanglePartBuilder.buildTop(width) + "\n" + rectanglePartBuilder.buildBody(width,height) + rectanglePartBuilder.buildBottom(width);
        return rectangle;
    }
}