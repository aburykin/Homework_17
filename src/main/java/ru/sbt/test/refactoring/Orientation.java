package ru.sbt.test.refactoring;

public enum Orientation {

    NORTH {
        public Orientation turnClockwise() {
            return Orientation.EAST;
        }

        public Point moveForwards(Point point) {
            return new Point(point.getX(), point.getY() + 1);
        }

    }, WEST {
        public Orientation turnClockwise() {
            return Orientation.NORTH;
        }

        public Point moveForwards(Point point) {
            return new Point(point.getX() - 1, point.getY());
        }

    }, SOUTH {
        public Orientation turnClockwise() {
            return Orientation.WEST;
        }

        public Point moveForwards(Point point) {
            return new Point(point.getX(), point.getY() - 1);
        }

    }, EAST {
        public Orientation turnClockwise() {
            return Orientation.SOUTH;
        }

        public Point moveForwards(Point point) {
            return new Point(point.getX() + 1, point.getY());
        }
    };
    
    public abstract Orientation turnClockwise();

    public abstract Point moveForwards(Point point);

}