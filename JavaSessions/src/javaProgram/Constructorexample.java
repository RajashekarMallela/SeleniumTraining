package javaProgram;

public class Constructorexample {
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
	Constructorexample(){
		System.out.println("Today is wednesday");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample exams = new Constructorexample();
		//method name with class is called constructor 
		exams.mul();
		
	}

}
