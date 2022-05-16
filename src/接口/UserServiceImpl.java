package 接口;

//一个类可以实现接口 implements
//实现了接口的类， 就需要重写接口中方法

//利用接口多继承
public class UserServiceImpl implements UserService, TimeService {

    @Override
    public void run() {

    }

    @Override
    public void speak(String name) {

    }

    @Override
    public void addName(String name) {

    }

    @Override
    public void deleteName(String name) {

    }

    @Override
    public void updateName(String name) {

    }

    @Override
    public void queryName(String name) {

    }


    @Override
    public void time() {

    }
}
