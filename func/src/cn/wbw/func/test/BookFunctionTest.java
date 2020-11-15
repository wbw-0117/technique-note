package cn.wbw.func.test;

import cn.wbw.func.service.BookFunction;

import java.util.stream.Stream;

/**
 * @author wbw
 * @date 2020/10/1414:43
 */
public class BookFunctionTest {

    public static void main(String[] args) {
        BookFunction<Integer, Integer, Boolean> bf = Integer::equals;
        System.out.println(bf.total(1, 2));

        BookFunction<Integer, String, String> sa = (a, b) -> a + b;
        System.out.println(sa.total(1, "as".toString()));

//        Stream.of().allMatch()
    }
}
