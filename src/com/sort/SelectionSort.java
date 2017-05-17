package com.sort;

/**
 * 选择排序
 * <p>
 * 在数组中，选出最小（或者最大）的一个数与第1个位置的数交换；
 * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
 * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 * Created by Administrator on 2017/5/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 4, 3, 1, 2, 8, 6};

        array = sort(array);
        System.out.println("--");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static int[] sort(int[] args) {
        int length = args.length;
        int temp, index;

        for (int i = 0; i < length; i++) {
            temp = args[i];
            index = i;
            for (int j = i; j < length; j++) {
                if (temp > args[j]) {
                    temp = args[j];
                    index = j;
                }
            }
            if (index != i) {
                temp = args[i];
                args[i] = args[index];
                args[index] = temp;
            }
        }
        return args;
    }
}
