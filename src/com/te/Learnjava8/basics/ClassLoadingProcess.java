package com.te.Learnjava8.basics;

class ClassLoaderProcess {
	static int staticVar = 10;
	static {
		System.out.println("static block execute");
		staticVar = 100;
	}
	int instanceVar = 20;
	{
		System.out.println("instance/Nonstatic block executed");
		instanceVar = 50;
	}

	static void staticMethod() {
		System.out.println("static method executed");
	}

	ClassLoaderProcess() {
		instanceVar = 200;
		System.out.println("instructions executed");
		System.out.println("constructor executed");
	}

	public void nonStaticMethod() {
		System.out.println("non static method executed");
	}

	static class StaticNestedClass {
		void display() {
			System.out.println("static Nested class executed");
		}
	}

	class Innerclass {
		void display() {
			System.out.println("Innerclass executed");
		}
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		ClassLoaderProcess.staticMethod();
		System.out.println("staticvar" + ClassLoaderProcess.staticVar);
		ClassLoaderProcess cp = new ClassLoaderProcess();
		cp.nonStaticMethod();
		System.out.println("nonStatic variable" + cp.instanceVar);
		StaticNestedClass sn = new StaticNestedClass();
		sn.display();
		Innerclass ic = cp.new Innerclass();
		ic.display();
		System.out.println("main() ends");
	}
}
