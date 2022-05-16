package 抽象类;

//抽象类：    类是单继承，  接口可以多继承
public abstract class Action {

    //约束~ 有人帮我们是实现
    //abstract ， 抽象方法，只有方法名，没有方法的实现
    public abstract void doSomething();

    //1. 不能new 这个抽象类，只能靠子类去实现他；
    //2. 抽象类里可以写普通方法
    //3. 抽象方法必须在抽象类里


}
