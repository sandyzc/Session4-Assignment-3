package com.Session4.Assignment3;

public class ClassB extends ClassA{
	int k;
		
	public ClassB(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	@Override
	public void test(){
		System.out.println(i+j+k);
	}

	

}
