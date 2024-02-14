package com.example.sort;

public class SelectionSort {

    void selectionSort(int[] arr) {
        int n = arr.length;

        // 배열의 각 위치에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            // 현재 위치 i를 최소값의 위치로 초기화
            int minIndex = i;
            // 현재 위치 이후의 배열을 순회하며 최소값의 위치를 찾음
            for (int j = i + 1; j < n; j++) {
                // 현재 선택된 최소값보다 더 작은 값을 찾으면, 최소값의 위치를 갱신
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 최소값이 현재 위치의 값이 아니라면 위치를 교환
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
    	// SelectionSort 클래스 인스턴스 생성
        SelectionSort ss = new SelectionSort();

        int[] arr = {4, 7, 2, 5, 1, 3, 6};

        //SelectionSort 클래스의 selectionSort 메소드 접근
        ss.selectionSort(arr);

        // 정렬된 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}