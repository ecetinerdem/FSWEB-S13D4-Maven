package org.example;

public class Point {
    // Private instance variables for encapsulation
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Distance method without parameters - calculates distance from (0,0)
    public double distance() {
        return distance(0, 0);
    }

    // Distance method with Point parameter
    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }

    // Distance method with two int parameters
    public double distance(int a, int b) {
        return Math.sqrt(
                (a - this.x) * (a - this.x) +
                        (b - this.y) * (b - this.y)
        );
    }
}