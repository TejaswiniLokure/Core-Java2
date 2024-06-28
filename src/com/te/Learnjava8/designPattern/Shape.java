package com.te.Learnjava8.designPattern;

public interface Shape {
	void draw();

}

class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("shape of circle");
	}

}

class Rectangle implements Shape {

	@Override
	public void draw() {

		System.out.println("shape of rectangle ");
	}

}

abstract class Shapefactory {
	abstract Shape shapefactory(String name);
}

class FactoryCircle extends Shapefactory {

	@Override
	Shape shapefactory(String name) {

		switch (name) {
		case "Circle":
			return new Circle();

		case "Rectangle":

			return new Rectangle();

		default:
//			throw new IllegalArgumentException();
			//or
			return null;
		}
	}

}

class FactoryDesignPattern {
	public static void main(String[] args) {
		FactoryCircle factoryCircle = new FactoryCircle();
		Shape circle = factoryCircle.shapefactory("Circle");
		circle.draw();
		Shape shapefactory = factoryCircle.shapefactory("Rectangle");
		shapefactory.draw();
	}
	
}
