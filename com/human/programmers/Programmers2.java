package com.human.programmers;

public class Programmers2 {

	public static void main(String[] args) {
		solution(121);
	}
//정수 제곱근 판별
	 public static long solution(long n) {
	        long answer = -1;
	        for(long i = 1;i <n;i++) {
	        	if(n/i == i && n%i == 0) {
	    	    System.out.println(n/i + "  " +i);
	        	answer = (i+1)*(i+1);
	        	}
	        }
	        System.out.println(answer);
	        return answer;
	    }
	 
		public static long solution2(long n) {
	        long answer = -1;
	        for(long i = 0;i*i<=n;i++) {
	        	if(i*i == n) {
	        	answer = (i+1)*(i+1);	
	        }
	        }
	        System.out.println(answer);
	        return answer;
	    }
}
