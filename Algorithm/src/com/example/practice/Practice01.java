package com.example.practice;

public class Practice01 {

	// 입력된 수 확인하는 메소드
	public void numberCheck(int a) {
		if(a > 0) {
			// a 는 0보다 크다 -> 양수
			System.out.println("입력된 수 " + a + " 은 양수 입니다.");
		} else if (a < 0) {
			// a 는 0보다 작다 -> 음수
			System.out.println("입력된 수 " + a + " 은 음수 입니다.");
		} else {
			// a 는 0보다 크지도 작지도 않다 -> 0
			System.out.println("입력된 수 " + a + " 은 0 입니다.");
		}
	}
		
	// 최댓값 구하는 메소드
	public int maxNumber(int a, int b, int c) {
		// a가 최댓값이라 생각하고 max에 셋팅
		int max = a;
			
		// max보다 b가 크면 max에 b 셋팅
		if(max < b)
			max = b;
			
		// max보다 c가 크면 max에 c 셋팅
		if(max < c)
			max = c;
			
		return max;
	}
		
	// 최솟값 구하는 메소드
	public int minNumber(int a, int b, int c) {
		// a가 최솟값이라 생각하고 min에 셋팅
		int min = a;
					
		// min보다 b가 작으면 min에 b 셋팅
		if(min > b)
			min = b;
					
		// min보다 c가 작으면 min에 c 셋팅
		if(min > c)
			min = c;
					
		return min;
	}
		
	// 중앙값 구하는 메소드
	public int midNumber(int a, int b, int c) {
		// 중앙값을 저장 할 변수
		int mid = 0;
			
		if(a > b) {
			if(a < c) {
				// b < a < c 의 상황
				mid = a;
			} else if(b > c) {
				// c < b < a 의 상황
				mid = b;
			} else {
				// b < c < a 의 상황
				mid = c;
			}
		} else {
			if(b < c) {
				// a < b < c 의 상황
				mid = b;
			} else if(a > c) {
				// c < a < b 의 상황
				mid = a;
			} else {
				// a < c < b 의 상황
				mid = c;
			}
		}
			
		return mid;
	}
		
	    
	public static void  main(String[] args){
		// Practice01 클래스 인스턴스 생성 
		Practice01 pre = new Practice01();
	    
		// Practice01 클래스의 numberCheck 메소드 접근
	    pre.numberCheck(20);
		pre.numberCheck(-20);
		pre.numberCheck(0);
			
	    // Practice01 클래스의 maxNumber 메소드 접근
	    int max = pre.maxNumber(1, 2, 3);
	    // Practice01 클래스의 minNumber 메소드 접근
	    int min = pre.minNumber(1, 2, 3);
	    // Practice01 클래스의 midNumber 메소드 접근
	    int mid = pre.midNumber(1, 2, 3);
	    	
	    System.out.println("최댓값은 " + max + " 입니다.");
	    System.out.println("최솟값은 " + min + " 입니다.");
	    System.out.println("중앙값은 " + mid + " 입니다.");
	}

}