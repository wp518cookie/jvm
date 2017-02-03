package chap4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ping.wu on 2017/2/3.
 */
class OOMObject {
    public byte[] placeholder = new byte[64 * 1024];
}

public class TestOOMObject {
    public static void fillHeap(int num) throws InterruptedException {
        List list = new ArrayList();
        for (int i = 0; i < num; i++) {
            // 稍作延时，令监视曲线的变化更加明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }
}
