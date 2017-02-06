package chap8;

/**
 * Created by ping.wu on 2017/2/6.
 */
public class code8_1 {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
