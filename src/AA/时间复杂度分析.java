package AA;

/**
 * @Author:guanliyu
 */
public class 时间复杂度分析 {


    /**
     * 常数阶 时间复杂度为O(1)
     * 尽管操作数量 size 可能很大，但由于其与输入数据大小 因此时间复杂度仍为O(1)
     * @param n
     * @return
     */
    int constant(int n) {
        int count = 0;
        int size = 100000;
        for (int i = 0; i < size; i++)
            count++;
        return count;
    }



    /**
     * 对数阶 时间复杂度为O(log n)
     * 与指数阶相反，对数阶反映了“每轮缩减到一半”的情况。设输入数据大小为log2n 即2的n次方反函数
     * 2的n次方为乘以n个2 所以反函数为除以2个2 以及log2n 也为2的n次方的反函数
     *
     * @param n
     * @return
     */
    int logarithmic(int n) {
        int count = 0;
        while (n > 1) {
            count++;
            n =n / 2;
        }
        return count;
    }

    /**
     *  线性阶 时间复杂度为O(n)
     *  线性阶的操作数量相对于输入数据大小以线性级别增长。线性阶通常出现在单层循环中
     * @param n
     * @return
     */
    int linear(int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            count++;
        return count;
    }

    /**
     * 线性对数阶O(n log n)
     * 线性对数阶常出现于嵌套循环中，两层循环的时间复杂度分别为O(2log n) 三层为O(3log n)
     * @param n
     * @return
     */
    int linearLogRecur(int n) {
        if (n <= 1)
            return 1;
        int count = linearLogRecur(n / 2) + linearLogRecur(n / 2);
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

    /**
     * 平方阶 O(N方)
     * @param n
     * @return
     */
    int quadratic(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;

    }


    /**
     * 指数阶O(2的N次方)
     * 生物学的“细胞分裂”是指数阶增长的典型例子：初始状态为1个细胞，分裂一轮后变为2个。分裂两轮后变成4个一次类推，分裂N轮后有2的N个细胞
     * @param n
     * @return
     */
    int exponential(int n){

    }


}
