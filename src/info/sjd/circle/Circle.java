package info.sjd.circle;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

}
