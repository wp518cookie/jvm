package chap3;

/**
 * Created by ping.wu on 2017/2/3.
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 * -XX:PretenureSizeThreshold=3145728
 */
public class TestPretenureSizeThreshold {
    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[ 4 * _1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}