package chap8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ping.wu on 2017/2/6.
 */
class Map1 extends HashMap {

}
public class TestMap {

    class Map2 extends HashMap {

    }
    public static void main(String[] args) {
        HashMap m = new HashMap();
        test(m);
    }
    public static void test(Map1 hashMap) {
        System.out.println("Map1");
    }
    public static void test(Map2 hashMap) {
        System.out.println("Map2");
    }
}
