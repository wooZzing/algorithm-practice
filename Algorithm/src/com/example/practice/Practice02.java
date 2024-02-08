package com.example.practice;

public class Practice02 {
	
	// 1부터 n까지 반복하는 while문
	public void whileLoop(int n) {
		
		int i = 1;
		while(i <= n) {
			System.out.println("while문이 " + i + "번 실행 됐습니다.");
			i++;
		}
		
	}
	
	// 1부터 n까지 반복하는 do...while문
	public void doWhileLoop(int n) {
			
		int i = 1;
		do {
			System.out.println("do ... while문이 " + i + "번 실행 됐습니다.");
			i++;
		} while( i <= n );
		
	}
	
	// 1부터 n까지 반복하는 for문
	public void forLoop(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.println("for문이 " + i + "번 실행 됐습니다.");
		}
		
	}
	
	// 1부터 n까지 곱셈표를 출력하는 메소드
	public void multiplicationTable(int n) {
		// 바깥쪽 for문은 기준이 되는 단의 수
		for(int i = 1; i <= n; i++) {
			// 안쪽 for문은 기준이 되는 단과 1부터 n까지 곱해서 출력해줄 반복문.
			for(int j = 1; j <= n; j++) {
				/* 1부터 j까지 곱한 결과를 한 줄로 출력.
				 * 각 줄에 i * j 를 통해 증가되는 i값에 따라 1부터 n까지 증가되는 j값을 계속 곱해준다.
				 */
				System.out.printf("%5d", i * j);
			}
			// 1단씩 진행 될때마다 줄바꿈 처리
			System.out.println();
		}
	}
	
	// 1부터 n까지 홀수값만 더한 결과를 구하는 메소드
	public int totalOdd(int n) {
		// 모든 홀수값을 더한 변수
		int total = 0;
			
		// i에 1을 대입 후 i부터 n까지 반복한다. 반복이 끝날때마다 i를 1 증가시킨다. 조건이 맞으면 계속 반복한다.
		for(int i = 1; i < n; i++) {
				
			// i에 2를 나누어서 나머지 몫이 1이라면 홀수이다.
			if(i % 2 == 1) {
					
				/* total = total + i 와 같은 문법
				 * total 변수에 i를 계속 더해준다. (ex. 1 + 3 + 5 ... + n)
				 */
				total += i;
			}
		}
			
		return total;
	}
		
	// 2부터 n까지 소수를 출력하는 메소드
	public void getPrimeNumber(int n) {
		// 바깥쪽 for문은 기준이 되는 수
		for(int i = 2; i <= n; i++) {
			// 소수 판별 변수
			boolean isPrime = true;
					
			for(int j = 1; j <= i; j++) {
				/* 1과 자기자신이 아닌 수가 나뉘었을때 나머지 값이 0 이라면 해당 i의 값은 소수가 아니다.
				 * 안쪽 반복문을 종료하고 소수가 아님을 분류하기 위해 isPrime에 false를 셋팅한다.
				 */
				if(i % j == 0 && j != 1 && j!= i) {
					isPrime = false;
					break;
				}
			}
					
			// isPrime이 false인 경우는 안쪽반복문에서 소수가 아니라고 판별이 된 경우이다. 
			if(isPrime) {
				// 2를 제외한 소수는 출력할때 앞에 콤마를 찍고 출력하기 위함.
				if(i != 2)
					System.out.printf(", %d", i);
				else
					System.out.printf("%d", i);
			}
		}
	}
	
	// 2부터 n까지 소수를 출력하는 메소드 (효율성 증가)
	public void upgradeGetPrimeNumber(int n) {
		if (n >= 2) {
            System.out.print("2"); // 2는 유일한 짝수 소수
        }
		
		// 바깥쪽 for문은 3부터 시작하여 홀수만 검사한다.
		for(int i = 3; i <= n; i += 2) {
			// 소수 판별 변수
			boolean isPrime = true;
			
			// 안쪽 for문은 i의 제곱근까지만 반복하여 검사한다.
			for(int j = 2; j <= Math.sqrt(i); j++) {				
				if (i % j == 0) {
					isPrime = false; // 소수가 아님
                    break;
                }
			}
			
			// 소수인 경우에만 출력
			if(isPrime) {
                System.out.printf(", %d", i);
            }
		}
		
		System.out.println();
	}
	
	// 왼쪽 아래를 직각으로하는 n단의 직각삼각형을 출력하는 메소드
	public void makeTriangle(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				/* 한줄로 1부터 i까지 한 줄로 출력.
				 * 각 줄에 증가되는 i값에 따라 1부터 i까지 증가되는 j값 만큼 계속 출력해준다.
				 */
				System.out.print("*");
			}
			// 1단씩 진행 될때마다 줄바꿈 처리
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// Practice02 클래스 인스턴스 생성 
		Practice02 pr = new Practice02();
		
		int n = 10;
		
		// Practice02 클래스의 whileLoop 메소드 접근
		pr.whileLoop(n);
		// Practice02 클래스의 doWhileLoop 메소드 접근
		pr.doWhileLoop(n);
		// Practice02 클래스의 forLoop 메소드 접근
		pr.forLoop(n);
		// Practice02 클래스의 multiplicationTable 메소드 접근
		pr.multiplicationTable(n);
		
		// Practice02 클래스의 totalOdd 메소드 접근
		int total = pr.totalOdd(n);
		
		// Practice02 클래스의 getPrimeNumber 메소드 접근
		pr.getPrimeNumber(n);
		
		// Practice02 클래스의 upgradeGetPrimeNumber 메소드 접근
		pr.upgradeGetPrimeNumber(n);
		
		// Practice02 클래스의 makeTriangle 메소드 접근
		pr.makeTriangle(n);
		
		System.out.println("1부터 " + n + "까지 홀수만 더한 결과는 " + total + " 입니다.");
	}

}