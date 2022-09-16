package com.human.ex;

public class Java03_Opeartions {

	public static void main(String[] args) {

		//산술연산자 +,=,*,/
		//부호연산자 음수,양수
		//문자열연산자
		String a = "양희수"+"학생";
		System.out.println("양희수"+"학생");
		//대입연산자
		int b = 5;
		System.out.println(b);
		//기존에 있는 변수 b에 곱하기 3을 하고
		//변수 b에 대입연산자 (=)로 할당
		b*=3;
		System.out.println(b);
		//증감연산자 i++
		for (int i = 1; i<4;i++) {}
		//비교연산자 == <= >= !=
		//instanceof 객체비교연산자
		//논리연산자 ! NOT ,&& AND 둘다 참,|| OR 둘중에 하나 참
		
		int check = 1;
		if(!(check == 2)) {
			System.out.println("check 출력");
		}
		//조건연산자 (상황연산자)
		//(check==1) 조건괄호의 true와 false를 확인
		//조건값이 참이면 좌측 50값 할당 참이 아닐경우 우측 40값 할당
		int check003 = (check==1)? 50:40;
		System.out.println(check003);
		
		int x = 1;
		int y = -1;
		//&&와 비교연산자(>)중에 >가 우선순위이므로
		//x>0 이 true 인지 false 인지를 먼저 확인하고
		//y<0 이 true 인지 false 인지를 확인 한 뒤에
		//&& 통해서 true/false 칸 출력
		//A && B 는 A조건과 B조건이 모두 true 이면 true 표시
		System.out.println(x>0 || y<0);
	}
}
