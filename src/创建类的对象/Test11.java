package 创建类的对象;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test11 {
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
    //获得Class对象
    Class c1 = Class.forName("创建类的对象.User");

    //构造一个对象  //因为要引用User类，要么文件在一个包下，要么User类是public的，所以在一个包下又建了一个文件Test04
    User user = (User)c1.newInstance();  //本质上调用的是无参构造器
    System.out.println(user);

    //通过构造器创建对象
    Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
    User user1 = (User)constructor.newInstance("胡歌",12,100);
    System.out.println(user1);
    System.out.println("***********************");

    //通过反射调用普通方法
    User user2 = (User)c1.newInstance();
    //通过反射获取一个方法
    Method setName = c1.getDeclaredMethod("setName", String.class);

    //invoke: 激活的意思
    //（对象， “方法的值”）
    setName.invoke(user2,"刘亦菲");
    System.out.println(user2.getName());

    System.out.println("***********************");

    //通过反射操作属性
    User user3 = (User)c1.newInstance();
    Field name = c1.getDeclaredField("name");

    name.setAccessible(true); //关闭程序的安全检测，才能操作私有属性
    //赋值
    name.set(user3,"杨幂");
    System.out.println(user3.getName());
  }
}
