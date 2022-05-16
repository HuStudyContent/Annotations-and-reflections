import 内部类.Outer;

public class MainTest {
    public static void main(String[] args) {

        System.out.println("hello");

        //定义一个外部类
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getId();
    }
}
