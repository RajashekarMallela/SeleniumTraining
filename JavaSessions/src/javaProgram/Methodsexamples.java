package javaProgram;

public class Methodsexamples {
	int a=5;
	int b=9;
	
	void Add() {
		System.out.println(a+b);
	}
	int Addition(int x, int y) {
		int z = x+y;
		return z;
		}
	
	
	public static void main(String[] args) {
		Methodsexamples wed = new Methodsexamples();
		wed.Add();
		
		System.out.println(wed.Addition(7, 56));
		System.out.println(wed.Addition(8, 8));
	}

	
}
