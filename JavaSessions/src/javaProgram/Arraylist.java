package javaProgram;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raja");
		names.add("shekar");
		names.add("karan");
		names.add("mamam");
		names.add("Raja");
		for (String output : names) {
			System.out.println(output);
		}
	}

}
