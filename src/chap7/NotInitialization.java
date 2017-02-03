package chap7;

/**
 * Created by ping.wu on 2017/2/3.
 * 常量会在编译阶段存入调用类的常量池，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
