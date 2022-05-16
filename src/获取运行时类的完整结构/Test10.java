package 获取运行时类的完整结构;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取大类的信息
public class Test10 {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
    Class c1 = Class.forName("反射.User");

    //获取类的名字
    System.out.println(c1.getName());   //获得包名+类名
    System.out.println(c1.getSimpleName());  //获得类名

    //获得类的属性
    System.out.println("********************");
    Field[] fields = c1.getFields();  //只能找到public属性

    fields = c1.getDeclaredFields();  //找到全部的属性
    for (Field field : fields) {
      System.out.println(field);
    }

    //获得指定属性的值
    Field name = c1.getDeclaredField("name");
    System.out.println(name);

    System.out.println("********************");

    //获得类的方法
    Method[] methods = c1.getMethods();  //获得本类的所有方法以及父类的所有方法
    for (Method method : methods) {
      System.out.println("正常的方法:"+method);
    }

    methods = c1.getDeclaredMethods();   //获取本类的所有方法
    for (Method method : methods) {
      System.out.println("本类的方法:"+method);
    }

    System.out.println("********************");

    //或得指定方法
    //类里面存在方法的重载，所以需要传入方法的名字和传入的属性两个参数
    Method getName = c1.getMethod("getName",null);
    Method setName = c1.getMethod("setName", String.class);
    System.out.println(getName);
    System.out.println(setName);

    System.out.println("********************");

    //获得类的构造器
    Constructor[] constructors = c1.getConstructors();
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }

    constructors = c1.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }

    //或得指定的构造器
    Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
    System.out.println("指定构造器:"+constructor);



  }
}
