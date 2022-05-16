package 类加载器的作用;

public class Test9 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获得系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取系统类加载器的父类加载器——》扩展加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); //sun.misc.Launcher$ExtClassLoader@1b6d3586

        //获取扩展类加载器的父加载器 -> 根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); //null

        //测试当前类是哪一个加载器加载的
        ClassLoader classLoader = Class.forName("类加载器的作用.Test9").getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //测试JDK 内置的类是谁加载的  是由根加载器加载，用c++编写，java这里获取不到，所以结果为null
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader); //null

        // 如何获得系统加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        * C:\Neo4j\java_JDK\jre\lib\charsets.jar;
        * C:\Neo4j\java_JDK\jre\lib\deploy.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\access-bridge-64.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\cldrdata.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\dnsns.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\jaccess.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\jfxrt.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\localedata.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\nashorn.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\sunec.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\sunjce_provider.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\sunmscapi.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\sunpkcs11.jar;
        * C:\Neo4j\java_JDK\jre\lib\ext\zipfs.jar;
        * C:\Neo4j\java_JDK\jre\lib\javaws.jar;
        * C:\Neo4j\java_JDK\jre\lib\jce.jar;
        * C:\Neo4j\java_JDK\jre\lib\jfr.jar;
        * C:\Neo4j\java_JDK\jre\lib\jfxswt.jar;
        * C:\Neo4j\java_JDK\jre\lib\jsse.jar;
        * C:\Neo4j\java_JDK\jre\lib\management-agent.jar;
        * C:\Neo4j\java_JDK\jre\lib\plugin.jar;
        * C:\Neo4j\java_JDK\jre\lib\resources.jar;
        * C:\Neo4j\java_JDK\jre\lib\rt.jar;
        * D:\java_practices\狂神_注解和反射\out\production\狂神;
        * D:\IDEA2020\IDEA2020ruanjian\IntelliJ IDEA 2020.1\lib\idea_rt.jar

         * */
    }
}
