package com.vari.testing;

public class CastingTest {
	public static void main (String[] args) {
		//자료형변환 알아보기
		//자동형변환은 자료형 크기가 작은 자료형에서 큰 자료형으로 변경이 될 때 가능
		
		//byte bnum = 200;
		byte bnum = 100;
		System.out.println(bnum);//->100, 자동형변환
		
		long lnum = 10000;//10000은 int이므로 long타입으로 자동형변환되어 에러가 나지 않음
		
		System.out.println(3.14+100);//3.14는 double, 100은 int이므로 100이 double로 자동형변환되어 에러없이 출력됨
		
		String msg = "유병승 "+19+"살";//19가 String으로 자동형변환 되어 나옴
		System.out.println(msg);
		
		//자동형변환(정수형)의 특이점
		//기본적으로 산술연산에 대한 값은 int형으로 처리가 됨
		byte bnum1 = 100;
		byte bnum2 = 10;
		//byte result = bnum1 + bnum2;//byte의 연산이 int형으로 처리가 되어 에러가 남
		byte result = (byte) (bnum1 + bnum2); //(byte) bnum1 + bnum2로 하지 않는 이유는 연산 우선순위에 따라 bnum1만 byte로 바뀌고 bnum2는 계속 int형이 되므로 에러가 유지됨
		
		int num1= 100;
		double dnum = 180.5;
		//int result1 = num1 + dnum; //dnum 때문에 double이 되어 int형 자료형에 대입되지 않아 에러가 남
		int result1 = (int)(num1+dnum);//280
		result1 = num1 + (int)dnum;//280, 위 코드와 같은 결과를 가짐
		
		
		//큰 자료형에서 작은 자료형으로 변경하는 것은? 강제 형변환
		//값에 따라 데이터의 손실이 일어남
		
		double weight = 65.5;//8byte
		int weightInt;//4byte
		
		//강제적 형변환 방법 -> 변수, 리터럴 앞에(왼쪽) (변환할 자료형)변수명|리터럴
		weightInt = (int)weight;//변수: weightInt, 리터럴: weight
		System.out.println("변환한 값 : "+weightInt);//65
		System.out.println("원본값 : "+weight);//65.5
		//형의 변환은 리터럴만 가능. 변수는 형변환이 불가능함. -> (double)weightInt = weight 안됨!!!!!!!
		
		//데이터 손실 발생상황
		int num = 290;
		bnum = (byte)num;
		System.out.println("원본값 : "+num);//290
		System.out.println("변환한 값 : "+bnum);//34
		
		//char형에 대한 자료형 변환
		//유니코드: 숫자와 문자를 매핑시켜놓은 코드
		char ch = 'A';//2byte
		int alpha = ch;//대입 가능, char은 내부적으로 양수를 저장
		System.out.println(alpha);//65
		System.out.println((char)alpha);//A
		//char ch2 = ch + 1; //1 때문에 ch가 int로 바뀌므로 char 안에 대입이 안되서 에러가 뜸
		char ch2 = (char)(ch + 1);
		System.out.println(ch2);
		
	}

}
