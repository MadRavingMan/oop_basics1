package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class PointApplication {
    public static void main(String[] args) {
        MyPoint firstPoint = new MyPoint(1, 2);
        MyPoint secondPoint = new MyPoint(8, 4);

        System.out.println(firstPoint);
        System.out.println(firstPoint.getXY());
        firstPoint.setXY(2, 4);
        System.out.println(firstPoint.getX());
        System.out.println(firstPoint.getY());
        System.out.println(firstPoint.getXY());

        System.out.println(secondPoint.distance());
        System.out.println(secondPoint.distance(0, 0));
        System.out.println(secondPoint.distance(firstPoint));
        System.out.println(secondPoint);

        for (int point : firstPoint.getXY()) {
            System.out.println(point);
        }
        secondPoint.setX(7);
        secondPoint.setY(77);
        System.out.println(Arrays.toString(secondPoint.getXY()));
    }
}
