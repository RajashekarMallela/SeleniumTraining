package javaProgram;


import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names = new HashSet<String>();
		names.add("Raja");
		names.add("shekar");
		names.add("karan");
		names.add("mamam");
		names.add("Raja");
		for(String output:names) {
			System.out.println(output);
		}
	}

}
