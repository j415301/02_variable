package com.homework.main;

public class Homework {
	public static void main(String[] args) {
	
//1		
	int age = 26;
	String name = "장혜린", address = "경기도 화성시";
	char gender = '여';
	double height = 164.5;
	float weight = 44.5f;
	
	System.out.println(""+age+name+gender+address+height+weight);
	
	
//2	
	int a = 100;
	long b = 10000L;
	float c = 234.567f;
	double d = 567.12356;
	char e = 'A';
	String f = new String("Hello World");
	boolean g = true;
	
	System.out.println(""+a+b+c+d+e+f+g);
	
	
//연습
	
	String str = "기차"+"칙칙폭폭";
	System.out.println(str);
	String str2 = "기차" + 123 + 45 + "출발";
	System.out.println(str2);
	String str3 = 123 + 45 + "기차" + "출발";
	System.out.println(str3);
	
	}

}
