package chengxi0.initializeandclearnup;

/**
 * @author 承夕
 * @date 2020/1/12 0012 - 16:27
 * @contact:https://github.com/chengxi0
 */
public class MethodOverLoad {
    void f1(byte a) {
        System.out.println(a);
        System.out.println("byte");
    }
    void f1(int a) {
        System.out.println("int");
    }

    void f1(long a) {
        System.out.println("long");
    }

    void f1(float a) {
        System.out.println("float");
    }

    void f2(float a) {
        System.out.println("float");
    }

    void f2(double a) {
        System.out.println("double");
    }
    public static void main(String[] args) {
        short a = 5 ;
        double d = 200;
        MethodOverLoad methodOverLoad = new MethodOverLoad();
        methodOverLoad.f1(a);
        //为了安全不丢失数据，从大的类型转换成小的可能丢失数据，编译器报错
        //methodOverLoad.f1(d);
        //但是如果通过强制类型转换，依然可以调用相对应类型的方法
        methodOverLoad.f1((byte) d);    //输出 -56
    }
}
/*
方法重载
构造器重载：当我们需要以多种方式去创建对象的时候，我们重载构造器方法达到目的
普通方法重载：不同的参数列表对应一般不同的方法体实现。
区分重载方法：必须有一个独一无二的参数类型列表（参数类型，参数个数，参数顺序）
注意点：a 参数顺序是可以区分方法重载，但是一般我们不这么写，因为这样的代码很难维护。
       b  涉及基本类型的重载，基本类型能够从一个“较小”的类型自动提升为一个“较大”的
       类型。
       c 因为有不少时候我们并不关心方法的返回值，而是关心方法的调用的其他效果，因此我们
       不以方法的返回值作为区别方法重载的标志
*/