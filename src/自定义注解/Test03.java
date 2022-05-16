package 自定义注解;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

//自定义注解
public class Test03 {

    //注解可以显式赋值， 如果没有默认值，必须就要赋值
    @MyAnnotation2(name = "胡学军", schools = {"北大", "清华", "交大"})
    public void  test2(){ }

    //注解只有一个值，可以不写参数名，只能是value才可以这么写
    @MyAnnotation3("胡学军")
    public void test3(){ }


}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数： 参数类型  +  参数名（）；
    String name() default "胡歌";
    int age() default 0;
    int id() default -1;     //如果默认值为-1, 代表不存在，

    String[] schools();
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}
