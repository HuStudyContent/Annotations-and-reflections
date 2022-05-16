package 注解和反射;

import java.util.ArrayList;
import java.util.List;

//什么是注解
public class Test01 {

    // @Override 重写的注解 注解可以检查约束
    @Override
    public String toString(){
        return super.toString();
    }

    // Deprecated 不推荐程序员使用，但是可以使用   已过时的
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    public static void main(String[] args) {
        test();
    }

    @SuppressWarnings("all")
    public void test02(){
        List<String> list = new ArrayList<>();
    }

}
