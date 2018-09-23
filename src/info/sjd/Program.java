package info.sjd;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class Program {

	public static void main(String[] args) {
		// MAIN
		Square square = new Square(10.0);
		System.out.println(square.getArea());

		Circle circle = new Circle(10.0);
		System.out.println(circle.getArea());

		Triangle triangle = new Triangle(10.0,5.0);
		System.out.println(triangle.getArea());

	}

}
