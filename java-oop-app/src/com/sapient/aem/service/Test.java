package com.sapient.aem.service;
public class Test{

	public void m(){
		System.out.println("This is method m() with no arguments");
	}

	public void m(String str){
		System.out.println(str);
	}

	public void m(int n){
		System.out.println(n);
	}

	public void m(int n, float m){
		System.out.println(n+","+m);
	}

	public void m(float n, int m){
		System.out.println(n+","+m);
	}


}