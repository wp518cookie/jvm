package chap2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ping.wu on 2017/1/24.
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
