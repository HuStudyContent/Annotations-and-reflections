package 测试元注解;

import java.lang.annotation.*;

//元注解
@MyAnnotation
public class Test02 {

    @MyAnnotation
    public void test(){

    }
}

//1.@interface 表示我们自定义了一个注解，名字叫MyAnnotation
//2.Target 表示我么注解可以用在什么地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//3.Retention 表示我们的注解在什么地方有效,
// runtime(运行时都有效)> class（在类中有效） > source(只在源码中有效)
@Retention(value = RetentionPolicy.RUNTIME)

//4.Documented 表示是否将我们的注解生成在javadoc 中
@Documented

//5.Inherited 子类可以继承父类的注解:
/* 意思就是我们的父类使用了我们自定义的MyAnnotation，并且这个接口使用了@Inherited注解，
那么父类和集成父类的子类两者都能继承这个类，要是没有添加@Inherited，只能父类有这个注解，子类不继承
* */
@Inherited
@interface MyAnnotation{

}
