//패키지 = 클래스 파일을 모으는 폴더
package com.human.ex;

//public 전급제한자로써 공개한다는 의미
//클래스 코드 한 덩어리
//Java02Type class 이름으로써 호출할 때 쓰는 별칭
public class Java02Type {

	//static 유일한 메서드라는 의미
	//void 리턴 값이 없음 (모든 메서드는 호출하면 리턴값이 있거나 없거나 함)
	//(String[] args) 인자값, 매개변수로써 메서드가 사용하는 원재료
	//string[] 문자열 들의 배열 (문자열을 모음집)
	//인자값 : 메서드를 호출할 때 원재료를 넣는다는 용어
	//매개변수 : 메서드 입장으로 봤을 때 받은 원재료를 지칭하는 말
	public static void main(String[] args) {
		
		//System 내장 클래스 (자바가 기본적으로 제공하는 클래스)
		//System OS(윈도우)와 자바를 연결해주는 인터페이스 클래스(객체)
		//out : System 클래스 내부에 있는 output(출력) 객체 (하나의 덩어리를 지칭)
		//println() 콘솔창에 입력된 값을 출력하는 메서드
		//() : 메서드이고, 괄호 안에는 인자갑을 넣을 수 있음
		System.out.println("양  희  수");
		
		//숫자 정수 타입 선언
		//num 별칭
		//= 대입연산자
		//1 실제 활당된 값
		//num이라는 변수이름에는 int타입으로만 데이터를 넣을 수 있다고 선언
		//=(대입연산자)를 통해 num이라는 변수이름에 1이라는 데이터를 넣는다
		int num = 0;
		int num10 = 10;
		int num20 = 20;
		int num30 = 30;
		int num40 = 40;

		//문자(한 글자:char)+열(다수) > 글자가 여러 개
		String stringA = "양희수";
		String stringABC ="박준석";
		System.out.println(num);
		System.out.println(stringA);
		
		//int num이라는 변수에 숫자 10과 20과 30을 더하여
		//System.out.println(num)으로 출력하시오
		num = num10 + num20 + num30;
		//= 대입연산자의 우측에 있는 num10 + num20 + num30 을 더한뒤 
		//num 이라는 변수에 데이터 저장
		System.out.println(num);
		
		//int num40이라는 변수에 40데이터를 넣고
		//String stringABC이라는 변수에 박준석이라는 데이터를 넣은 뒤
		//System.out.println(stringABC)으로 박준석40을 출력하시오
		//문자열과 숫자를 통합해서 어떻게 출력되는가?
		
		//캐스팅 (자동형변환)
		//stringABC + 40 >> 문자열 + 정수 가능 !
		//stringABC는 문자열 타입이므로 박준석40은 문자열로 취급
		stringABC = stringABC + num40;
		System.out.println(stringABC);
		
		//변수이름은 첫글자 소문자를 추천 (대문자일 경우 타입과 헷갈릴 수 있음)
		String stirngEFG = "휴먼교육센터";
		String stringHIF = "3클래스";
		//" " 공백도 문자열 취급
		String stringOutput = stirngEFG + " " + stringHIF;
		System.out.println(stringOutput);
	
		//본인의 이름과 지금 배우고 있는 언어 "자바"를 포함하여 자기소개의
		//키워드를 더하여 출력하는 구문을 만드세요.
		//변수가 하는 일 ? 데이터를 저장하고 꺼내서 쓰는 저장스토어
		//반복적인 업무를 할 때 사용
		String name = "양희수";
		String job = "학생";
		System.out.println(name + " " + stirngEFG+ " " +stringHIF + " " +job);
	}

}
