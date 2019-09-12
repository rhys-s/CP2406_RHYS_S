

public class Road {
    private final int roadWidth = 40;
    private double carLength = 6;
    private int identifier;
    private double roadLength;
    private double initialX1, initialY1, finishX1, finishY1;
    private String orientation;
    private int[] touchingRoads = new int[]{0, 1, 2, 3, 4, 5};


    public Road(double roadLength, double initialX1, double initialY1, String orientation, int identifier, int[] touchingRoads) {
        this.roadLength = roadLength;
        this.initialX1 = initialX1;
        this.initialY1 = initialY1;
        this.orientation = orientation;
        this.identifier = identifier;
        this.touchingRoads = touchingRoads;
    }

    public void checkRoadEnd() {
        if (orientation.equals("Horizontal")) {
            setFinishX1(initialX1 + roadLength);
        } else if (orientation.equals("Vertical")) {
            setFinishX1(initialX1 + roadLength);
        }
    }

    public int[] getTouchingRoads() {
        return touchingRoads;
    }

    public String getOrientation() {
        return orientation;
    }

    public double getInitialX1() {
        return initialX1;
    }

    public double getFinishX1() {
        return finishX1;
    }

    public void setFinishX1(double finishX1) {
        this.finishX1 = finishX1;
    }

    public double getFinishY1() {
        return finishY1;
    }

    public void setFinishY1(double finishY1) {
        this.finishY1 = finishY1;
    }

    public double getInitialY1() {
        return initialY1;
    }

    public double getRoadLength() {
        return roadLength;
    }

    public int getRoadWidth() {
        return roadWidth;
    }


    public int getIdentifier() {
        return identifier;
    }

    public void setTouchingRoads(int[] touchingRoads) {
        this.touchingRoads = touchingRoads;
    }
}
