package q5;

public class Box {

	private double length;
	private double breadth;
	private double height;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Box(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double calculateArea() {
		return this.length * this.breadth;
	}
	
	public double calculateVolume() {
		return this.length * this.breadth * this.height;
	}
	
}
