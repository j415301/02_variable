package com.vari.printtest;

import java.util.Scanner;//import 위치 기억!!!
//1. java.util.Scanner를 import 함

public class InputTest {
	//키보드에서 입력한 값 가져오기
	
	public static void main(String[] args) {
		//키보드에서 입력한 값 RAM에 저장하기
		//: 자바에서 제공하는 Scanner 클래스 이용
		//Scanner 클래스는 java.util패키지에 속해 있음
		
		//2. 클래스를 사용하려면 반드시!!!!!!!! new 연산자를 이용해서 생성
		//생성: new 클래스명() -> ex. new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		//Scanner: 참조형 자료형, sc: 변수

		//3. Scanner가 제공하는 기능(매소드)을 이용해서 키보드의 입력값을 가져온다.
		//기능: nextInt(), nextDouble(), next(), nextLint() 등
		//	1. nextInt(): int 타입의 값을 가져오는 기능
		//	2. nextDouble(): double 타입의 값을 가오는 기능
		//	3. next(): 문자열을 '띄어쓰기 기준으로' 가져오는 기능, 띄어쓰기 앞에 문자열을 가져옴
		//	4. nextLine(): 문자열을 '개행 기준으로' 가져오는 기능, 개행 앞의 문자열을 가져옴
		
		System.out.print("당신의 나이는? ");//사용자에게 나이를 입력받기 위한 질문
		int age = sc.nextInt();
		System.out.println("입력값 : "+age);//정수 입력 받을 때
		//정수(ex. 19)를 입력했을 때 -> 잘 작동함
		//실수(ex. 19.1를 입력했을 때 -> runtime error(빨간 Exception~) why? int 자료형에 실수를 입력했기 때문
		System.out.print("당신의 키는? ");
		double height = sc.nextDouble();//실수 입력 받을 때
		System.out.println("입력값: "+height);
		
		//문자열 입력받기
		System.out.print("당신의 주소 ");
		String name = sc.next();
		sc.nextLine();//buffer를 비워주는 코드
		System.out.println("next(): "+name);
		System.out.print("당신의 주소 ");
		name=sc.nextLine();
		System.out.println("nextLine(): "+name);
		
		//정수, 실수, 문자(next())를 입력받고 nextLine()을 입력받을 경우 반드시 *buffer*를 비워줘야 함
		//System.out.println("당신의 나이는? ");
		//int age1 = sc.nextInt();
		//System.out.println("당신의 주소는? ");
		//String addr = sc.nextLine();
		//System.out.println("나이: "+age1+", 주소: "+addr);
		//이 경우에 나이를 입력하고 엔터를 치면 바로 마지막 출력문(나이:,주소:)로 넘어가는 것을 볼 수 있는데 이것은 나이를 입력받은 후 buffer에 남아있던 \n에 의해 '당신의 주소는?'과 이어지는 출력문이 그냥 넘어가버림
		//이를 방지하기 위해 사용해줘야하는 코드가 바로 sc.nextLine()
		
		System.out.println("당신의 나이는? ");
		int age1 = sc.nextInt();
		sc.nextLine();
		System.out.println("당신의 주소는? ");
		String addr = sc.nextLine();
		System.out.println("나이: "+age1+", 주소: "+addr);
		//sc.nextLine()코드를 nextLine매소드 사용 전에 넣어줬더니 아까와 같은 문제가 발생하지 않음을 확인할 수 있음
		
		
		
	}	

}
