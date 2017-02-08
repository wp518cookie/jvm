package chap10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class TestCompile {
    public static void main (String[]args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "你好");
        map.put("how are you?", "吃了没?");
        System.out.println(map.get(1));
        System.out.println(map.get("how are you?"));
    }
}
