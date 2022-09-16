package com.human.ex;

public class Java02_casting {

	public static void main(String[] args) {

//		//int 4byte
//		//double 8byte : int 보다 더 많은 숫자를 표현 할 수 있음.
//		//int 타입의 숫자를 double 타입으로 바꿀 수 있음
//		
//		//변수의 선언부는 바꿀 수 없지만 (정적 타입 선언)
//		//데이터는 이동이 가능하므로 형변환(casting)이 존재
//		
//		//자동캐스팅x 강제캐스팅o double > int
//		int intDataCasting = 1000;
//		double doubleDataCasting = 990;
//		//double 영역은 int 영역보다 크므로
//		//int영역에서 double 데이터영역을 표현하지 못하여 에러가 발생
//		//강제 캐스팅을 할 경우 캐스팅 대상 타입(int)에서 벗어난 데이터일 경우
//		//손실 발생 위험 있음
//		//(int) 문구 작성으로 double데이터를 int타입 변수에 강제적으로 할당
//		intDataCasting = (int) doubleDataCasting;
//
//		
//		//자동 캐스팅 double > int
//		int intData = 1000;
//		double doubleData = 990;
//		System.out.println(intData);
//		System.out.println(doubleData);
//		//intData 변수에 할당된 1000을 대입연산자(=)을 통해 doubleData변수에 저장
//		doubleData = intData;
//		System.out.println(doubleData);
		
		double sum = 1048;
		for(int i = 1; i<30; i++) {
			System.out.println("hello world " + i +"번째 입니다");
			sum = sum/2;
			//1. for문이 0번째 실행되고 종료한다
			//2. for문 안에 if을 넣고 break를 실행하면 for문까지 종료한다
			// > for문에 특정 값이 되면 강제적으로 for문 종료할 수 있다.
			if(sum<2) {
				System.out.println(i+"번째에서 종료합니다. 현재 sum은 " +sum+"입니다");
				break;
			}
		}
	}

}
