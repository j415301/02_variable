//기본적인 변수 선언해보자!

package com.vari.basic;

public class BasicVariable {
	
	public static void main(String[] args) {
		//변수 선언하기 -> 저장 공간 확보하기
		//변수 선언 방법: 자료형 변수명;
		
		//true or false를 저장하는 저장공간 확보하기
		boolean flag;
		//변수 명칭 지정 시 지켜야할 규약
		//1. 대소문자 구분이 되고 길이 제한이 없음
		//2. 예약어 사용 불가
		//3. 숫자로 시작하면 안됨
		//4. 특수문자는 _와 $만 허용
		//5. 여러 단어 변수명 작성 시 첫 글자는 무조건 소문자, 그 뒤로 이어지는 단어의 첫글자는 대문자로 작성->camelcase(낙타봉표기법)
		//6. 변수에 들어올 데이터를 예상할 수 있도록 명명
		//7. 변수명에 한글을 쓸 수 있지만, 쓰지마세요!
		
		//변수 선언 시 주의사항
		//동일한 영역 내에서는 동일한 변수명이 있으면 안됨!! 변수명 중복 불가
		
		//변수에 값 대입하기: 대입 연산자 '=' 이용
		//               변수명 = 대입할 값
		int mathRecord;
		mathRecord = 100;
		System.out.println(mathRecord);
		
		mathRecord = 85;
		System.out.println(mathRecord);
		
		//숫자(정수) 이외의 값을 저장하려면 어떻게 해야할까?
		//논리형
		flag = true;
		flag = false;
		
		//문자형
		char gender;
		gender = '남'; //문자의 데이터는 ''으로 표시
		
		String email;
		email = "j415301@naver.com"; //문자열의 데이터는 ""로 표시
				
		//실수형
		double height;
		height = 165.5;
		
		float weight;
		weight = 41.5f; //float 데이터는 뒤에 f를 붙여야 함
		//컴퓨터에서 연산할 때는 반드시 같은 자료형이어야 함
		
		//정수형
		
		byte anum;
		short bnum;
		int cnum;
		long longNum;
		longNum = 100; //자동형변환이 됨
		longNum = 100000000000L; // 값이 int의 범위를 넘었으므로 자동형변환이 되지 않음. 따라서 long타입으로 자료를 입력해줘야 하며 뒤에 'L'을 붙여야 함
		
		//*정리
		//문자열리터럴: "문자열"
		//문자리터럴: '문자'
		//정수리터럴: 숫자
		//정수 long: 숫자L(대문자 -> 숫자 1과 쉽게 구별하기 위해)
		//실수 float: 숫자.숫자f
		//실수 double : 숫자.숫자
		
		//변수 선언과 동시에 초기화: 변수 공간의 확보와 동시에 값을 입력하는 것
		int a = 100;
		String name = "장혜린";
		
		//변수 여러개 선언과 동시에 초기화 하기
		char alpha = 'a', beta = 'b', ceta = 'c';
		
		//문자열에 대한 추가학습
		//문자열: 클래스(객체)
		String nickname = "윌리";
		System.out.println(nickname);
		//-> String 선언과 동시에 초기화 할 수 있는 또다른 방법
		String nickname1=new String("윌리");
		System.out.println(nickname1);
		//문자열은 +연산을 통해 -> "병승"+"선생" -> "병승선생" (두 개의 문자열을 결합시킴)
		System.out.println("곧"+"쉬는시간");
		String msg = "오늘은 "+"금요일";
		System.out.println(msg);
		
		//변수명+변수명 -> 출력 가능
		System.out.println(nickname+msg);
		msg = "코딩";
		System.out.println(nickname+msg);
		
		//문자열+숫자 -> 문자열이 하나라도 있으면 모든 자료형이 문자열로 바뀌어 출력됨
		System.out.println("이거 되니?"+19);
		System.out.println("이건?"+true);
		
		System.out.println(gender+email+height+weight); //gender은 문자형, 문자열인 email이 모든 자료형을 문자열로 바꿈
		System.out.println(height+gender+email+weight); //문자열인 email 뒤에 있는 weight만 문자열로 바뀌고, email 앞에 있는 height는 바뀌지 않음.
		
		System.out.println(gender+email+(height+weight)); //height+weight에 우선 순위를 부여해 더하기 연산을 한 후 출력됨
		
		//모두 문자열로 출력할 수 있는 또 다른 방법
		System.out.println(""+height+gender+email+weight);
		System.out.println(height+(weight+email)+gender);
		
		System.out.println(height+gender);//char이 double로 자동 형변환됨
		
		
		//상수: 변경할 수 없는 저장공간
		final String admin;
		admin="master";
		System.out.println(admin);
		//admin="notmaster"; //이미 값이 할당되었다고 에러메세지가 뜸
	}
	
//Q. 프로젝트를 새로 생성해서 com.homework.main 패키지를 만들고 Homework클래스에 나이, 성명, 성별, 주소, 키, 몸무게를 변수에 저장하고 출력해보세요!
//변수명으로 출력하고, 한줄에 모든 데이터를 출력하세요!

}
