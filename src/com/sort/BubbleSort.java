package com.sort;

/**
 * 冒泡排序
 * <p>
 * 每次查询将前一个值与后一个值比较和交换，每次查找都将最大的值放到数组的最后
 * Created by Administrator on 2017/5/17.
 */
public class BubbleSort {
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
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (args[j] < args[j - 1]) {
                    int temp = args[j];
                    args[j] = args[j - 1];
                    args[j - 1] = temp;
                }
            }
        }
        return args;
    }

}
