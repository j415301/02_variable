package com.homework.main;

public class Homework {
	public static void main(String[] args) {
	
//1		
	int age = 26;
	String name = "������", address = "��⵵ ȭ����";
	char gender = '��';
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
	
	
//����
	
	String str = "����"+"ĢĢ����";
	System.out.println(str);
	String str2 = "����" + 123 + 45 + "���";
	System.out.println(str2);
	String str3 = 123 + 45 + "����" + "���";
	System.out.println(str3);
	
	}

}
