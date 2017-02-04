package chap2;

/**
 * Created by ping.wu on 2017/1/24.
 */
public class StringIntern {
    public static void main(String[] args) {
        String s1 = "aaaa";
        String s2 = new String("aaaa");
        String s3 = s2.intern();
        System.out.println(s1 == s3);
    }
}
