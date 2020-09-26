package lt.internship;

public class RectanglePartBuilder {

    private String topLeftCorner = "┌";
    private String topRightcorner = "┐";
    private String bottomLeftCorner = "└";
    private String bottomRightCorner = "┘";
    private String middlePart = "─";
    private String bodyPart = "│";

    public String buildTop(int width) {
        String topPartCompleted="";
        topPartCompleted = topLeftCorner;
        for(int i=0; i<width-2; i++) {
            topPartCompleted+=middlePart;
        }
        topPartCompleted +=topRightcorner;
        return topPartCompleted;
    }


    public String buildBody(int width, int height) {
        String bodyPartCompleted = "";
        for(int i=0; i<height-2; i++) {
            bodyPartCompleted += bodyPart;
            if(width-2 > 0) {
                for(int j=0; j<width-2; j++) {
                    bodyPartCompleted+=" ";
                }
            }
            bodyPartCompleted+=bodyPart;
            bodyPartCompleted+= "\n";
        }
        return bodyPartCompleted;
    }


    public String buildBottom(int width) {
        String bottomPartCompleted = bottomLeftCorner;
        for(int i=0; i<width-2; i++) {
            bottomPartCompleted+=middlePart;
        }
        bottomPartCompleted +=bottomRightCorner;
        return bottomPartCompleted;
    }
}