package com.sort;

/**
 * 希尔排序
 * <p>
 * 将整个待排序的记录序列分割成为若干子序列，分别进行直接插入序列，
 * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序
 * <p>
 * 49 38 65 97 76 13 27 49 55 04
 * <p>
 * 说明：
 * while (mark >= 1) 将无序序列不断进行二分，知道两者简介小于1
 * <p>
 * for (int i = 0; i < mark; i++) 根据第一个的步数，获取到该步数的分组
 * <p>
 * for (int j = i + mark; j < args.length; j += mark) 和 while (k >= 0 && args[k] > temp) 就是快速排序
 * <p>
 * 注意点：
 * <p>
 * 之前快速排序 下标变化为1，希尔排序的下标变化为mark(步数，间距)
 * Created by Administrator on 2017/5/16.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = new int[]{9, 4, 3, 1, 2, 8, 6};

        array = sort(array);
        System.out.println("--");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static int[] sort(int[] args) {
        int mark = args.length;
        while (mark >= 1) {
            mark = mark / 2;
            for (int i = 0; i < mark; i++) {
                //根据增量值分组
                for (int j = i + mark; j < args.length; j += mark) {
                    //每个单组进行插入排序
                    int k = j - mark;
                    int temp = args[j];
                    while (k >= 0 && args[k] > temp) {
                        args[k + mark] = args[k];
                        k -= mark;
                    }
                    args[k + mark] = temp;
                }
            }
        }
        return args;
    }
}
