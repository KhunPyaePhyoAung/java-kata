package me.khun.kata.fundamental;

/**
 * You will be given an array of numbers.
 * You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 * Examples
 *
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
public class SortTheOdd {

    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 1) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 1 && arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }

        return arr;
    }
}
