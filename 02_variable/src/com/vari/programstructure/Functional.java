package com.vari.programstructure;

import java.util.Scanner;

//��� ������ Ŭ����: ����� ������ ����
public class Functional {
	public void inputData() {
		//���̵�, �н�����, ����, ����
		
		System.out.println("==== ȸ������ �Է� ====");
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ�� ���̵�: ");
		String userID = sc.nextLine();
		System.out.println("ȸ�� ��й�ȣ: ");
		String password = sc.nextLine();
		System.out.println("ȸ�� ����: ");
		int age = sc.nextInt();
		System.out.println("ȸ�� ����: ");
		char gender = sc.next().charAt(0);
		
		System.out.println(userID+password+age+gender);
		
		
		
		
		
	}
	
}
