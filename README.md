# my-java-simple-sort

## 插入排序

### 思路  
从无序数列中依次取值，插入到一个有序数列中。  
1. 将无序数列的第一个值，和第一个值之后的所有值区分为两组，第一组只有一个值（我们认为他是有序的），其余的值我们认为他是无序的。
2. 正序依次取第二组中的每一个值为监控值。
3. 倒序依次取分组一中的每一个值进行比较（从第一组的最后一个值开始）。若第一组中的值大于监控值，将第一组中的该值向后移动一位，并修改监控值需要放置的位置。
4. 将监控值放置到第一组正确排序的位置。

### Java代码实现
```
public static int[] sort(int[] args) {
    int i = 1, j;
    int length = args.length;
    int temp;
    for (; i < length; i++) {
        if (args[i] < args[i - 1]) {
            temp = args[i];
            j = i;
            while (j > 0 && temp < args[j - 1]) {
                args[j] = args[j - 1];
                j--;
            }
            args[j] = temp;
        }
    }
    return args;
}
```

## 希尔排序

### 思路  
将无序数列根据（length/2）的**间隔**进行分组，并对每个分组进行快速排序，直到**间隔值**小于1。  
**间隔值** == 数组长度/2
1. 将无序数列根据**间隔值**的间隔分成2组。
2. 每个分组进行插入排序。
3. 对两组无序数列进行**间隔值**的间隔再次进行分组。
4. 对每个分组进行插入。
5. 重复3，4步骤，直到**间隔值**小于1


### Java代码实现
```
public static int[] sort(int[] args) {
        int mark = args.length;
        while (mark >= 1) {
            mark = mark / 2;
            for (int i = 0; i < mark; i++) {
                for (int j = i + mark; j < args.length; j += mark) {
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
```
### Java代码解释
1. while 对无序数组不断进行二分，直到二分间距小于1。
2. for (int i = 0; i < mark; i++);  的结果是获取到书友该分组的值
3. 第二个for和while 就是插入排序的代码

## 冒泡排序

### 思路  
每循环一次，将该次循环中的最大值，放到该次排序的最后。  
每次循环将前一个值与后一个值比较，前一个值大就交换。

### Java代码实现
```
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
```