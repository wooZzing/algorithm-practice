package com.example.sort;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		
		int n = arr.length;
        
		// 배열의 마지막 길이 -1 까지 반복한다.
		for (int i = 0; i < n-1; i++) {
			// 인접한 원소들을 비교하고, 필요한 경우 위치를 바꾸기 위해 배열을 순회한다. 
			// 각 순회마다 이미 정렬된 마지막 원소는 제외하고 비교한다.
			for (int j = 0; j < n-i-1; j++) {
				// 이전 원소가다음 원소보다 클 경우 바꿔준다.
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		// BubbleSort 클래스 인스턴스 생성
		BubbleSort bs = new BubbleSort();
    	
		int arr[] = {4, 7, 2, 5, 1, 3, 6};
        
		// BubbleSort 클래스의 bubbleSort 메소드 접근
		bs.bubbleSort(arr);
        
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
    }
}