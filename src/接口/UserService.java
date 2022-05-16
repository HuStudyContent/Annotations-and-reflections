package 接口;

//interface 定义的关键字, 接口都需要实现类       接口也是一种抽象类， 接口只有方法的定义
public interface UserService {
    //常量
    int age = 99;

    //接口中的所有定义其实都是抽象的 public
    public abstract void run();
    //可以直接这样写
    void speak(String name);

    //简单的增删改查
    void addName(String name);
    void deleteName(String name);
    void updateName(String name);
    void queryName(String name);

}
