package javaProgram;

public class Polymorphism {
int a=5;
int b=10;
void Add() {
	System.out.println(a+b);
}
void Add(int x, int y) {
	int z = x+y;
	System.out.println(z);
}
int Add(int x, int y, int z) {
	int p = x+y+z;
	return p;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism refvar = new Polymorphism();
		refvar.Add();
		refvar.Add(7, 7);
		System.out.println(refvar.Add(6, 8, 9));
	}

}
