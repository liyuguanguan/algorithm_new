package AA;

/**
 *
 * 给定一个斐波那契数列 0 1 1,2,3,5,8,13.. 求第N个数字
 * 数列的前两个数字为:f(1)=0 f(2)=1
 * 数列中的每个数字是前两个数字的和 公式2:f(x)=f(x-1)+f(x-2)
 * 本质上讲递归就是自己调用自己
 * 从算法角度看，搜索、排序、回溯、分治、动态规划等许多重要算法策略直接或间接地应用了这种思维方式
 * @Author:guanliyu
 */
public class 斐波那契数列 {

    /**
     * 递归调用
     * @param n
     * @return
     */
    public static int a(int n){
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return a(n - 1) + a(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(a(5));
    }


}
