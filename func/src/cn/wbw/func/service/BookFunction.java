package cn.wbw.func.service;

/**
 * @author wbw
 * @date 2020/10/1414:40
 */
@FunctionalInterface
public interface BookFunction<A, B, C> {

    C total(A a, B b);
}
