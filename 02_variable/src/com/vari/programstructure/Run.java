package com.vari.programstructure;
import com.vari.programstructure.func.Functional2;

//실행용 클래스: main()
public class Run {
	public static void main(String[] args) {
		//외부 클래스에 있는 기능 이용하기
		
		new Functional().inputData();
		//Functional 클래스 불러옴
		
		new Functional2().printData();//에러나는 이유: functional2의 패키지명과 현재 있는 패키지명이 다르기 때문 -> 임포트 해줘야 함
	
		
		
		
		
		
		
	}

}
