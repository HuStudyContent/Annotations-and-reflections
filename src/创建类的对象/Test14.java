package 创建类的对象;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test14 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
    Class c1 = Class.forName("创建类的对象.Student");

    //通过反射获取注解
    Annotation[] annotations = c1.getAnnotations();

    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }

    System.out.println("***********");
    //获得注解的value值
    Tablekuang tablekuang = (Tablekuang)c1.getAnnotation(Tablekuang.class);
    String value = tablekuang.value();
    System.out.println(value);

    System.out.println("***********");

    //获得类指定的注解
    Field f = c1.getDeclaredField("name");
    Fieldkuang annotation = f.getAnnotation(Fieldkuang.class);
    System.out.println(annotation.columnName());
    System.out.println(annotation.length());
    System.out.println(annotation.type());


  }
}

@Tablekuang("db_student")
class Student {

  @Fieldkuang(columnName = "db_id",type = "int",length = 10)
  private int id;
  @Fieldkuang(columnName = "db_age",type = "int",length = 10)
  private int age;
  @Fieldkuang(columnName = "db_name",type = "varchar",length = 4)
  private String name;

  public Student(){}

  public Student(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}

//创建一个自定义注解  : 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablekuang{
  String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldkuang{
  String columnName();
  String type();
  int length();
}


