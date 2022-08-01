package com.maven_pract;

import com.base_class.Pojo_A;

public class Pojo_B {
public static void main(String[] args) {
	Pojo_A a = new Pojo_A();
	int a2 = a.getA();
	System.out.println("Before setter : " + a2 );
	a.setA(1000);
	int a3 = a.getA();
	System.out.println("After setter : " + a3);
}
}
