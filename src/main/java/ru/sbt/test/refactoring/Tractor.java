package ru.sbt.test.refactoring;

public class Tractor {

    private final Field field;
    private Point position;
    private Orientation orientation;

    public Tractor() {
        field = new Field(5, 5);
        position = new Point(0, 0);
        orientation = Orientation.NORTH;
    }

    public void move(String command) {
        if ("F".equals(command)) moveForwards();
        else if ("T".equals(command)) turnClockwise();
    }

    public void moveForwards() {
        position = orientation.moveForwards(position);
        checkTractorInDitch();
    }

    public void turnClockwise() {
        orientation = orientation.turnClockwise();
    }

    public int getPositionX() {
        return position.getX();
    }

    public int getPositionY() {
        return position.getY();
    }

    public Orientation getOrientation() {
        return orientation;
    }

    private void checkTractorInDitch() {
        if (getPositionX() > field.getMaxX() || getPositionY() > field.getMaxY())
            throw new TractorInDitchException();
    }

}
