
import java.util.ArrayList;

    public class Vehicle {
        final double carLength = 6.0;
        private int currentRoad;
        private double length, initialX, initialY, width, speed, currentX, currentY;
        private String direction;

        //Default constructor
        public Vehicle(double initialX, double initialY, String direction,int currentRoad) {
            this.initialY = initialY;
            this.initialX = initialX;
            this.direction = direction;
            this.currentRoad = currentRoad;

        }
        // This function changes the currentX or currentY value to be that of the front of the car depending on
        // direction of travel
        public void initiateFrontOfVehicle() {
            if (getDirection().equals("East")) {
                setCurrentX(currentX + getLength());
            } else if (getDirection().equals("West")) {
                setCurrentX(currentX - getLength());
            } else if (getDirection().equals("North")) {
                setCurrentY(currentY + getLength());
            } else if (getDirection().equals("South")) {
                setCurrentY(currentY - getLength());
            }
        }

        public double getWidth() {
            return width;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }


        public void setCurrentX(double currentX) {
            this.currentX = currentX;
        }

        public void setCurrentY(double currentY) {
            this.currentY = currentY;
        }

        public double getCurrentX() {
            return currentX;
        }

        public double getCurrentY() {
            return currentY;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getSpeed() {
            return speed;
        }

        public double getLength() {
            return length;
        }

        public double getInitialX() {
            return initialX;
        }

        public double getInitialY() {
            return initialY;
        }

        public int getCurrentRoad() {
            return currentRoad;
        }

        public void setCurrentRoad(int currentRoad) {
            this.currentRoad = currentRoad;
        }

        public double getCarLength() {
            return carLength;
        }
    }
