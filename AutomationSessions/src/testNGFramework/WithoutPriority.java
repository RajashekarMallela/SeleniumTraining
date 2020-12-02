package testNGFramework;

import org.testng.annotations.Test;

public class WithoutPriority {

	@Test
	public void a_script() {
		System.out.println("Script1");
	}
	@Test
	public void b_script() {
		System.out.println("Script2");
	}
	
	@Test
	public void c_script() {
		System.out.println("Script3");
}
	@Test
	public void d_script() {
		System.out.println("Script4");
	}
	
	@Test
	public void e_script() {
		System.out.println("Script5");
}
	@Test
	public void f_script() {
		System.out.println("Script6");	
	}
}