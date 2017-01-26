package chap2;

/**
 * Created by ping.wu on 2017/1/24.
 */
public class StringIntern {
    public static void main(String[] args) {
        String str2 = new StringBuilder("he").append("llo").toString();
        String str1 = new String("hello");
        System.out.println(str2 == str2.intern());
    }
}
