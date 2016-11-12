package com.Session4.Assignment3;

public class ClassC extends ClassB{

	public ClassC(int i, int j, int k) {
		super(i, j, k);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ClassC c = new ClassC(10,20,30);
		c.test();
		/*the answer is "e" coz test method can be invoked by overiding 
		 * in classb and same can be invoked in class c
		 */
	}

}
