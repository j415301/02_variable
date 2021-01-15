package com.vari.programstructure;

import java.util.Scanner;

//기능 제공형 클래스: 기능을 가지고 있음
public class Functional {
	public void inputData() {
		//아이디, 패스워드, 나이, 성별
		
		System.out.println("==== 회원정보 입력 ====");
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 아이디: ");
		String userID = sc.nextLine();
		System.out.println("회원 비밀번호: ");
		String password = sc.nextLine();
		System.out.println("회원 나이: ");
		int age = sc.nextInt();
		System.out.println("회원 성별: ");
		char gender = sc.next().charAt(0);
		
		System.out.println(userID+password+age+gender);
		
		
		
		
		
	}
	
}
