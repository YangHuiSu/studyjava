package com.human.programmers;

public class Programmers {

	public static void main(String[] args) {

		// System.out.println(examEvenAndOddCustom(20));
		//examEvenAndOddCustom(50);
		//solution1(10);
		lackofmoney(100,600,3);
	}
//부족한 금액 계산하기

	    public static long lackofmoney(int price, int money, int count) {
	        long answer = -1;
	        long  m = 0;
	        for(int i=1;i<=count;i++) {
	           	m += price*i;
	        	System.out.println(m);
	        }
	        if(money-m > 0) {
	          	answer = 0;
	        }else {
	        	answer = m-money;
	        }
	        System.out.println(answer+ "값");
	        return answer;
	    }
	
	
	// 두 정수 사이의 합
	public static long solution3(int a, int b) {
		long answer = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
				System.out.println(i + "출력");
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
				System.out.println(i + "출력");
			}
		}
		System.out.println(answer + "값");
		return answer;
	}

	// 두 정수 사이의 합
	public static long solution(int a, int b) {
		long answer = 0;
		int count = 0;
		int maximum = 0;
		int minimum = 0;
		if (a - b != 0) {
			if (a - b >= 0) {
				count = a - b;
				maximum = a;
				minimum = b;
			} else {
				count = (a - b) * -1;
				maximum = b;
				minimum = a;
			}
			for (int i = 1; i < count; i++) {
				answer += minimum + i;
			}
			answer += minimum + maximum;
		} else {
			answer = a;
		}
		System.out.println(answer + "값");
		return answer;
	}

	// 나머지가 1이 되는 수 찾기
	public static int solution1(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				answer = i;
			}
		}
		System.out.println(n + "을 " + answer + "으로 나눈 나머지가 1입니다.");
		return answer;
	}

	// 짝수와 홀수
	public static double examEvenAndOddCustom(int num) {
		System.out.println("매개변수는 " + num + "입니다");
		// 1부터 매개변수 num까지 범위 내에서
		// 2의 배수, 3의 배수, 4의 배수, 5의 배수의 경우
		// 각각
		// System.out.println(i+"의 값은 ? 배수 입니다")
		// 문구를 출력하고 main메서드에서
		// examEvenAndOddCustom return값인 3의 배수, 4의 배수, 5의배의
		// 개수를 double타입의 숫자로 출력하시오
		// 2,3,4,5 의 배수의 갯수 중에 2번 째로 많은 배수의 갯수를 가진
		// ?배수의 이름을 출력하시오
		double count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int value1 = 0;
		int value2 = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
				count2++;
				System.out.println(i + "의 값은 2의 배수 입니다");
			}
			if (i % 3 == 0) {
				count++;
				count3++;
				System.out.println(i + "의 값은 3의 배수 입니다");
			}
			if (i % 4 == 0) {
				count++;
				count4++;
				System.out.println(i + "의 값은 4의 배수 입니다");
			}
			if (i % 5 == 0) {
				count++;
				count5++;
				System.out.println(i + "의 값은 5의 배수 입니다");
			}
		}
		
		count2 = 0;
		count3 = 20;
		count4 = 10;
		count5 = 0;
		if (count2 > count3 && count2 > count4 && count2 > count5) {
			value1 = count2;
			if(count3 > count4 && count3 > count5) {
				value2 = count3;
			}
			if(count4 > count3 && count4 > count5) {
				value2 = count4;
			}
			if(count5 > count4 && count5 > count3) {
				value2 = count5;
			}
		} else if (count3 > count2 && count3 > count4 && count3 > count5) {
			value1 = count3;
			if(count2 > count4 && count2 > count5) {
				value2 = count2;
			}
			if(count4 > count2 && count4 > count5) {
				value2 = count4;
			}
			if(count5 > count4 && count5 > count2) {
				value2 = count5;
			}
		} else if (count4 > count2 && count4 > count3 && count4 > count5) {
			value1 = count4;
			if(count3 > count2 && count3 > count5) {
				value2 = count3;
			}
			if(count2 > count3 && count2 > count5) {
				value2 = count2;
			}
			if(count5 > count2 && count5 > count3) {
				value2 = count5;
			}
		} else if (count5 > count2 && count5 > count3 && count5 > count4) {
			value1 = count5;
			if(count3 > count4 && count3 > count2) {
				value2 = count3;
			}
			if(count4 > count3 && count4 > count2) {
				value2 = count4;
			}
			if(count2 > count4 && count2 > count3) {
				value2 = count2;
			}
		}
		
		
		System.out.println("2의 배수 값은 " + count2 + " 입니다");
		System.out.println("3의 배수 값은 " + count3 + " 입니다");
		System.out.println("4의 배수 값은 " + count4 + " 입니다");
		System.out.println("5의 배수 값은 " + count5 + " 입니다");
		System.out.println("배수의 총값은 " + count + " 입니다");
		System.out.println("첫번째로 많은 배수의 값 " + value1 + " 입니다");
		System.out.println("두번째로 많은 배수의 값 " + value2 + " 입니다");
		return count;
	}
}
