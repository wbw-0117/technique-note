package cn.wbw;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 练习
 *
 * @author wbw
 * @date 2020/10/1118:17
 */
public class Practice01 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);
        // 2.0e-6 表示 2.0*10的-6次方
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(2.0e-6);
        System.out.println(true && false || true && true);

        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");

        System.out.println("--------------------------");
        int f = 0, g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.print(f + "\t");
            f = f + g;
            g = f - g;
        }

        System.out.println("\n--------------------------");
        double t = 9.0;
        System.out.println(.001 + "\t" + .002);
        while (Math.abs(t - 9.0 / t) > .001) {
            System.out.print(Math.abs(t - 9.0 / t) + "\t" + t + "\t");
            t = (9.0 / t + t) / 2.0;
        }
        System.out.println();
        StdOut.printf("%.5f\n", t);

        System.out.println();
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println();
        System.out.println('b');
        // ascii  转为int 之后 相加，之后 转成字符串
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
        System.out.println((byte) 'b');
        System.out.println((byte) 'c');
        System.out.println((int) 'c');
        System.out.println((double) 'c');
        System.out.println((float) 'c');
        System.out.println((short) 'c');
        System.out.println((long) 'c');
        System.out.println((boolean) ('c' > 'a'));

        int a = 'c';
        int b = 'd';

        String xasasa = new String("xasasa");
        String[] strings = {"sss", "aaaa", "sasa", "asdfasda", "wetew2twe"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println();
        char[] sasa = {'a', 's', 'a', 's', 'd'};
        String asasa = "asasf";
        int i = asasa.compareTo(String.valueOf(sasa));
        System.out.println(i);
        System.out.println();
    }
}
