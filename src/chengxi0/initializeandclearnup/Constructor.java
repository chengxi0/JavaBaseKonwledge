package chengxi0.initializeandclearnup;

/**
 * @author 承夕
 * @date 2020/1/12 0012 - 15:44
 * @contact:https://github.com/chengxi0
 */
public class Constructor {
    private int i = 2 ;
    private int j ; 

    public Constructor(){
        System.out.println("无参构造器");
        System.out.println(i);
        System.out.println(j);
    }
    public Constructor(int i ){
        System.out.println(this.i);
        this.i = i ;
        System.out.println(i);
        System.out.println("有参构造器");
        System.out.println(j);
    }
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(4);
    }
}
/*
构造器确保初始化
构造器：通过构造器，类的设计者可以确保每个对象都会得到初始化。
垃圾回收器：对于不再使用的内存资源，垃圾回收器自动将其释放。不需要
手动释放内存，这个也是Java与C++语言不一样的一个点。
如何命名构造方法：采取与类名相同的名称
构造方法的特点：  a 没有返回值，与返回值为void类型是明显的不一样
                b  与类名一致
                c  可以重载构造器
                d  在没有显式写构造器的情况下，编译器自动加入了默认构造器，但是如果你写了一个
                或者多个有参构造函数，那么编译器不会再给你自动创建默认的构造器，因此常常我们会
                加上一个无参构造器

 思考题：定义时初始化和通过构造器初始化有什么区别？
    变量定义时初始化的次数是一次的，如上面的变量i，但是如果通过构造器进行初始化
    就是两次的，首先编译器初始化就赋值一个2 ，然后构造方法再初始化为4.如上面我
    利用一个参数 的构造器初始化i值却没有把j值初始化，但是打印的时候，j值为0 ，说明
    了编译器如果发现成员没有显式初始化，就会帮我们初始化为0，即使我们没有在构造器初始化
    也没有关系。
 */