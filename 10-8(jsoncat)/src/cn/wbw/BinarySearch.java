package cn.wbw;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @author wbw
 * @date 2020/10/119:45
 */
public class BinarySearch {

    public static void main(String[] args) {
//        int[] whitelist = In.readInts();
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) {
//            // 读取键值，如果不存在于白名单中则将其打印
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) < 0) {
//                StdOut.println(key);
//            }
//        }

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 34, 567, 3451, 12345, 2345, 3456, 6789, 9786, 345345};
        System.out.println(BinarySearch.rank(6, a));
    }

    /**
     * 接收一个白名单文件，过滤掉标准输入所有存在白名单条目
     *
     * @param key 键值
     * @param a   白名单
     * @return flag
     */
    public static int rank(int key, int[] a) {
        // 数组有序的
        int startLo = 0, hi = a.length - 1;
        while (startLo <= hi) {
            // 被查找的键要么不存在，要么必然存在于a[startLo..hi]之中
            int mid = startLo + (hi - startLo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                startLo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
