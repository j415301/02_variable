package com.vari.printtest;

public class PrintTest {
	public static void main(String[] args) {
		//System.out.print와 System.out.println의 차이
		
		String name = "유병승";
		int age = 19;
		double height = 180.5;
		double weight = 65.5;
		char gender = 'M';
		
		//print메소드 활용
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		
		//엔터 친 것과 동일, 내용 없이 개행하고 싶을 때
		System.out.println();
		
		//println메소드 활용
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		//printf 이용하여 출력하기
		//'이름은 name변수값입니다.' 출력하기
		System.out.println("이름은 "+name+"입니다.");
		System.out.printf("이름은 %s입니다.", name);
		System.out.printf("이름은 %s입니다.", 19);//19가 문자열로 자동형변환
		//System.out.printf("이름은 %d입니다.", name);//name은 String, d는 정수형이므로 타입이 맞지 않음
		
		System.out.printf("이름은 %s이고, 나이는 %d입니다", name, age);
		System.out.println();
		
		//printf 메소드는 값의 정렬, 소수점 자리수 표현을 쉽게 할 수 있음
		System.out.println("유병승 19");
		System.out.println("정진 20");
		System.out.println("장연재 21");
		System.out.println();
		
		//printf를 이용해 정렬
		System.out.printf("%5s %d \n", "유병승", 19);
		System.out.printf("%5s %d \n", "정진", 20);
		System.out.printf("%5s %d \n", "장연재", 21);
		System.out.println();
		
		System.out.printf("%-5s %d \n", "유병승", 19);
		System.out.printf("%-5s %d \n", "정진", 20);
		System.out.printf("%-5s %d \n", "장연재", 21);
		System.out.println();
		
		//소수점 표시에 대해 설정할 수 잇음
		System.out.printf("%f\n", height);//소수점 아래 6자리까지 출력
		System.out.printf("%.2f\n", height);//소수점 아래 2자리 까지 출력
		
		//Q. 몸무게를 소수점 3자리까지 출력해보시오.
		System.out.printf("%.3f\n", weight);
		
		//Q. 나는 OOO이고, 나이는 OO이고, 성별은 O, 키는 OOO.OO, 몸무게는 OO.O입니다.
		System.out.printf("나는 %s이고, 나이는 %d이고, 성별은 %c, 키는 %.2f, 몸무게는 %.1f입니다.\n", name, age, gender, height, weight);
		
		//Q. 나는 OOO이고, 나이는 OO이고,
		//   성별은 O, 키는 OOO.OO, 몸무게는 OO.O입니다.
		System.out.printf("나는 %s이고, 나이는 %d이고,\n성별은 %c, 키는 %.2f, 몸무게는 %.1f입니다.\n", name, age, gender, height, weight);
		
		
		//escape문에 대해 알아보자
		//문자열에서 특정기능을 수행하는 문자
		
		//\t tab
		String msg = "안녕하세요";
		System.out.println(msg);
		msg = "안녕\t하세요";
		System.out.println(msg);
		msg = "안녕\t\t하세요";
		System.out.println(msg);
		
		//\n new line
		msg  = "여러분 점심은 \n맛있게 먹었나요?";
		System.out.println(msg);
		
		//\" 큰 따옴표
		msg = "\"야 너 똑바로 해!\"라고 말했다.";
		System.out.println(msg);
		
		//
		String path = "c:\\Users\\user1";
		
	}

}
