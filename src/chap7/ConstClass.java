package chap7;

/**
 * Created by ping.wu on 2017/2/3.
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}
