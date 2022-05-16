package 测试类什么时候会初始化;

//测试类什么时候会初始化
public class Test8 {

    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1. 主动引用
//        Son son = new Son();

        //反射也会产生主动引用
//        Class.forName("测试类什么时候会初始化.Son");

        //不会产生类的引用的方法
//        System.out.println(Son.b);

        //通过数组定义类引用，不会产生类引用
//        Son[] array = new Son[3];

        //引用常量不会触发类的初始化
        System.out.println(Son.M);
    }
}

class Father{

    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{

    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;  //常量

}
