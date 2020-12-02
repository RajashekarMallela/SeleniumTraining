package javaProgram;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "Raja", "Siva", "Sujan", "Kumar", "komal" };
		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
		for (String b : a) {
			System.out.println(b);
		}
	}

}
