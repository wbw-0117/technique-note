package cn.wbw;

import java.util.Objects;

/**
 * uniCode 编码
 *
 * @author wbw
 * @date 2020/10/1314:05
 */
public class UniCode {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
//        for (char j = 0; j < 1000; j++) {
//            System.out.println(j + "\t" + j);
//        }
        UniCode code = new UniCode();
        System.out.println(code.toString());


        System.out.println();
        String x = "string";
        String y = "string";
        String z = "string";
        // true
        System.out.println(x == y);
        // false
        System.out.println(x == z);

        UniCode ac = new UniCode();
        ac.a = "rtyhrtyhrthjwr46645hy345h57";
        UniCode bc = new UniCode();
        bc.a = new String("rtyhrtyhrthjwr46645hy345h57");
        System.out.println(ac == bc);
        System.out.println(ac.equals(bc));

    }

     String a = "";

    @Override
    public String toString() {
        return "UniCode{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniCode code = (UniCode) o;
        return a.equals(code.a);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(a);
//    }
}
