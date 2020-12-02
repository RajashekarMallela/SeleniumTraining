package javaProgram;

public class Mathmatticaloperations {
	int a=5;
	int b=7;
	void add() {
		System.out.println(a+b);
		}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Mathmatticaloperations maths=new Mathmatticaloperations();
		//This is ref variable.
		System.out.println(maths.a);
		maths.add();
		maths.add();
		maths.sub();
		
	}

}
