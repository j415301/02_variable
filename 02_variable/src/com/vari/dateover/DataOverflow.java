package com.vari.dateover;

public class DataOverflow {
	
	public static void main (String[] args) {
		//데이터 오버플로우 확인하기
		
		byte bnum = 125;
		//bnum++ : bnum변수의 값을 1 증가시키는 연산자
		//System.out.println(++bnum);//126
		//System.out.println(++bnum);//127
		//System.out.println(++bnum);//-128 -> byte는 127까지 밖에 표현할 수 없으므로 -128로 돌아옴 ()
		//System.out.println(++bnum);//-127
		
		//int bnum = 125;
		//bnum++ : bnum변수의 값을 1 증가시키는 연산자
		System.out.println(++bnum);//126
		System.out.println(++bnum);//127
		System.out.println(++bnum);//128 -> 자료형을 int로 바꾸니 값이 정상적으로 잘 나옴, why? 범위가 127을 훨씬 초과하기 때문
		System.out.println(++bnum);//129
		
		for(int i=0; i<100; i++){
				System.out.println(++bnum); //bnum을 byte 타입으로 지정했을 때 일정범위 안에서 값이 반복되는 것을 확인할 수 있음
		}
		//SO! 연산 후 이상한 값이 나올 때는 저장공간이 부족한 것이므로 타입을 바꿔주자
		
	}

}
