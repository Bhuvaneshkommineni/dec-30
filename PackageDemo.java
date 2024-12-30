
package edu.peters.fsd;

class Test{
	private int m = 100;
	
	void m1() {
		System.out.println("m....>"+m);
	}
}

/*class Sample{
	
	void m2() {
		System.out.println(" m---->"+m);
	}
}*/



public class PackageDemo {

	public static void main(String[] args) {

		// private 
	
		Test test = new Test();
		test.m1();
		
		
		// default 
		// protected 
		// public
		
	}

}
