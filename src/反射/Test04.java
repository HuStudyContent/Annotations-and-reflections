package 反射;

//什么是反射
public class Test04 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的class 对象
        Class c1 = Class.forName("反射.Test04");
        System.out.println(c1);


        Class c2 = Class.forName("反射.Test04");
        Class c3 = Class.forName("反射.Test04");
        Class c4 = Class.forName("反射.Test04");


        //一个类在内存中只有一个class 对象
        //一个类被加载后， 类的整个结构都会被封装在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}


//实体类
class User{
    private String name;
    private int age;
    private int id;

    public User(){

    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private void test() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
