import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);
        double triangleAArea= triangleA.findArea();
        System.out.println("Area of Triangle A "+ triangleAArea);
        double triangleBArea = triangleB.findArea();
        System.out.println("Area of Triangle B "+ triangleBArea);
        System.out.println("No of sides in Triangle: "+Triangle.numOfSides);
    }
}
