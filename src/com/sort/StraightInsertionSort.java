package com.sort;

/**
 * 插入排序，直接插入排序
 * <p>
 * 直接插入排序的算法思路
 * 1、设置监视哨r[0],将待插入记录值复制给r[0];
 * 2、设置开始查找的位置j;
 * 3、在数组中进行搜索，搜索中将第j个记录后移，直至r[0].key >= r[j].key 为止。
 * 4、将r[0]插入r[j+1]的位置上。
 * <p>
 * 个人理解：
 * 1、将需要的排序的值拿出来作为一个监控值，导致 a[i] 位置内容为空。
 * 2、a[i] 左边的值是有序的，右边的值是无序的。
 * 3、从a[i-1] 开始向左查找，若原来a[i] 值小于a[i-1],那么a[i-1] 向后移动一位。
 * Created by Administrator on 2017/5/15.
 */
public class StraightInsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 1, 2};

        array = sort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static int[] sort(int[] args) {
        int i = 1, j;
        int length = args.length;
        int temp;
        for (; i < length; i++) {
            if (args[i] < args[i - 1]) {
                temp = args[i];
                j = i;
                while (j > 0 && temp < args[j - 1]) {
                    //将前面一个值赋值给后面一个值
                    args[j] = args[j - 1];
                    j--;
                }
                args[j] = temp;
            }
        }

        return args;
    }


}
