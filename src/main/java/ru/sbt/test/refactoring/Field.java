package ru.sbt.test.refactoring;

/**
 * Created by ABurykin on 16.09.2016.
 */
public class Field {

    private final int maxX;
    private final int maxY;

    public Field(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
