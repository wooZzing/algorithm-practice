package com.example.sort;

public class InsertionSort {

    void insertionSort(int[] arr) {
        int n = arr.length;

        // 배열의 두 번째 원소부터 시작하여 마지막 원소까지 반복
        for (int i = 1; i < n; i++) {
            // 현재 원소를 key에 저장
            int key = arr[i];
            // 이전 원소의 인덱스를 j에 저장
            int j = i - 1;

            // key보다 큰 이전 원소들을 한 칸씩 뒤로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // 이동이 완료된 위치에 key(현재 원소)를 삽입
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // InsertionSort 클래스 인스턴스 생성
        InsertionSort is = new InsertionSort();

        int[] arr = {4, 7, 2, 5, 1, 3, 6};

        // InsertionSort 클래스의 insertionSort 메소드를 호출하여 배열 정렬
        is.insertionSort(arr);

        // 정렬된 배열 출력
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}