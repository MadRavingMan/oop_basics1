package com.itacademy.java.oop.basics;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arrayXY = {x, y};
        return arrayXY;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance(int x, int y) {
        double xx = Math.abs(x - this.x);
        double yy = Math.abs(y - this.y);
        return Math.hypot(yy, xx);
    }

    public double distance(MyPoint myPoint) {
        double xx = Math.abs(myPoint.x - this.x);
        double yy = Math.abs(myPoint.y - this.y);
        return Math.hypot(yy, xx);
    }

    public double distance() {
        double xx = Math.abs(0 - this.x);
        double yy = Math.abs(0 - this.y);
        return Math.hypot(yy, xx);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
