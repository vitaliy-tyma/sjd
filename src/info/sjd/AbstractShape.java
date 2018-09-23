package info.sjd;

public abstract class AbstractShape implements Shape {

	private int someInt;
//	public abstract double getArea();

	public int getSomeInt() {
		return someInt;
	}

	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}
	
	@Override
	public double getArea() {
		// TODO No realization here
		return 0;
	}

}
