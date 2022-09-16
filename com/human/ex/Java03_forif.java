package com.human.ex;

public class Java03_forif {

	public static void main(String[] args) {

		// for 반복문 (특정 코드를 반복적으로 실행하는 구문)
		// for() 괄호안에 특정조건이 만족할 때까지 반복하는 구문
		// int i = 0; i라는 변수에 int 타입으로만 들어간다고 선언
		// i에 0이라는 데이터를 할당 (= 대입연산자)
		// 조건부
		// i < 10; i라는 변수가 10 미만일 경우까지 for문을 실행
		// 증강식
		// i++ for문 한 번 실행 될 때마다 i변수는 1씩 증가
//		double sum = 24;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("for문시작 " + i+"입니다");
//			sum = sum/2;
//			System.out.println(sum);
//			//sum은 처음에 0이고
//			//sum은 1번 돌아갈 때마다 1가 1씪 증가하므로
//			//sum은 for 문이 돌아갈 때마다 1씩 값을 계속 더함
////			sum = sum * i;
////			System.out.println(sum);
//		}

		// int는 정수를 표현하는 타입이므로 소수점 표현 불가
//		int intExample = 1;
//		//double은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		double doubleExample = 1;
//		//float은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		float floatExample = 1;
//		
//		System.out.println(intExample);
//		System.out.println(doubleExample);
//		System.out.println(floatExample);
		// double num10 = 1048을 할당해주고
		// 1048을 지속적으로 1/2로 줄인다면 몇 번에 걸쳐서 줄여야
		// 2보다 작게 되는지 알수있는 출력하는 for을 작성하시오
		// console 예)
		// for문시작 3입니다
		// num10은 지금 **입니다.

		// for 조건식에서 먼저 확인되는 우선순위
		// 1. 초기식 int i = 1 실행
		// 2. 조건식 num10>2; for문 실행 여부 확인
		// 3. {}코드 실행
		// 4. 증강식 i++은 for 문의 1회 모두 실행 된 후에 1의 값이 변동 뒤 2번으로 이동 실행
//		double num10 = 1048;
//		for(int i = 1; num10 > 2; i++) {
//			System.out.println("for문시작 " + i+"입니다");
//			System.out.println("num10은 지금 "+num10+"입니다");
//			num10 = num10/2;
//		}

//		double num10 = 1048;
//		for(int i = 1; i <= 20; i=i+1) {
//			if(num10 <2 ) {
//				System.out.println("for문시작 " + i+"입니다");
//				System.out.println("num10은 지금 "+num10+"입니다");
//			}
//			num10 = num10/2;
//		}
		// if 조건문 (특정 코드를 일정한 조건(조건이 성립할 경우)에 의해 실행하는 구문)
		if ((2 * 2) > 3) {
			// System.out.println("if문 실행");
		}

		// 숫자 1부터 30까지 반복하면서
		// 2로 나누어서 나머지가 없는 숫자를 출력하시오
//		for(int k = 0; k<30; k++) {
//			//k라는 숫자를 2로 나누어서 나머지를 출력
//			//k = 3일경우 2로 나누면 나머지 (1)을 출력
//			if(k%2 == 0) {
//				System.out.println(k + "를 2로 나누면 나머지가 "+k%2);
//			}
//		//	System.out.println(k + "를 2로 나누면 나머지가 "+k%2);
//		}

		// 2중 for문
//		for(int a=0; a<=5; a++) {
//			System.out.println("현재 for문 a 실행 중 a값은 "+a);
//			for(int b=0; b<=3; b++) {
//				System.out.println("현재 for문 b 실행중!! b의 값은 "+b);
//				if(a==1) {
//					System.out.println("a는 1입니다");
//				}
//			}
//		}

		// 3의 배수
//		for(int k = 0; k<=30; k=k+3) {
//			//!= 는 같지 않다
//			if(k!=0) {
//			System.out.println("현재 3의 배수는 "+ k + "입니다");
//			}
//		}
//		
		// 가로 32cm, 세로 27cm의 1cm 단위의 눈금종이가 있다
		// 1줄씩 확인하여(가로) 1cm 마다 움직이는 로봇이 있는데
		// 가로를 모두 확인하면 세로 한 줄 넘어가서 가로 다시 확인
		// 가로 세로 길이 cm 합이 3의 배수 일 경우
		// 가로 ?cm 더하기 세로 ?cm는 3의 배수입니다 구문을 출력하시오
		// for문 안에 for문을 사용하고 if을 통해 조건을 확인하시오
//		for (int a = 0; a <= 27; a++) {
//
//			for (int b = 0; b <= 32; b++) {
//				if (a + b != 0) {
//					if ((a + b) % 3 == 0) {
//						System.out.println("가로 " + b + "cm 더하기 세로 " + a + "cm는 3의 배수입니다");
//					}
//				}
//			}
//		}
		
		//String abcdsave : abcdsave 변수에는 String 문자열만 저장 가능 선언!
		//= methodTest() : methodTest()에서 나오는 문자열을 대입연산자 좌측에 할당
		//= "abcd"; >> metodTest() 호출(불러오면)하면 "abcd" 문자열을 받음
		
		String name = "양희수";
		//metodTest(name)는 name이라는 인자값(전달값)을 넣고 실행
		String abcdsave = methodTest(name);
		System.out.println("main method에서 실행! !"+abcdsave);
	}

	//public 접근제한자
	//static 유일한 메서드
	//void 리턴 값이 없음
	public static String methodTest(String inputName) {
		System.out.println("정상적 출력! "+inputName);
		return inputName;
	}
}
