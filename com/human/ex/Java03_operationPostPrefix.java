package com.human.ex;

public class Java03_operationPostPrefix {

	public static void main(String[] args) {

		//1.단항 연산자(피 연산자(변수)가 하나인 것)
		// 삼항 연산자(?true:false)
		//2. 전위연산자, 후위연산자
		//3. 오버플로우 (*스택오버플로우)
		//타입이 갖고 있는 max값보다 더 많은 수치를 받을 경우
		//ex)int의 max값은 약2억 정도인데 그 이상의 수치를 대입하면
		//max값인 2억정도만 출력한다
		
		int i = -100;
		//부호 연산자는 변수 앞에 부호를 붙히는 것
		//부호를 붙힌다는 것은 부호1 곱셈과 같다 (ex) -1*변수명)
		int result = -i;
		System.out.println(result);
		
		int i2 = 0;
		//후위연산자 (연산자(+)가 뒤에 있는 것을 말함)
		//전위연산자 (연산자(+)가 앞에 있는 것을 말함)
		++i2;
		System.out.println(i2);
		
		int x =10;
		int y =10;
		int z;
		
		System.out.println("--------------");
		x++;
		++x;
		System.out.println(x);
		
		System.out.println("--------------");
		y--;
		--y;
		System.out.println(y);
		
		//후위연산자 : x의 기존값을 그대로 할당한 뒤에 연산
		//전위연산자 : x값을 연산 후 z에 할당한다
		System.out.println("--------------");
		z=x++;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
	}
	
}
