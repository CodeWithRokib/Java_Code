package PracticeJava;

import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
    }
}
