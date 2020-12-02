package testNGFramework;

import org.testng.annotations.Test;

public class Groupingconcept {
	@Test(groups="X")
	public void a_script() {
		System.out.println("Script1");
	}
	@Test(groups="X")
	public void b_script() {
		System.out.println("Script2");
	}
	
	@Test(groups="X")
	public void c_script() {
		System.out.println("Script3");
}
	@Test(groups="Y")
	public void d_script() {
		System.out.println("Script4");
	}
	
	@Test(groups="Y")
	public void e_script() {
		System.out.println("Script5");
}
	@Test(groups="Y")
	public void f_script() {
		System.out.println("Script6");	
	}
}
