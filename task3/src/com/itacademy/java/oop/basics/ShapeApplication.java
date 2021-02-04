package com.itacademy.java.oop.basics;

public class ShapeApplication {

    static Square[] shapes;

    public static void main(String[] args) {
        Square kvadratas = new Square(2.2, 2.2);
        Square staciakampis = new Square(2.3, 2.5);

        shapes = new Square[]{kvadratas, staciakampis};

        for (Square square : shapes) {
            if (square.getLength() > 0 && square.getWidth() > 0){
                System.out.println(square.getLength());

            }

        }
    }
}
