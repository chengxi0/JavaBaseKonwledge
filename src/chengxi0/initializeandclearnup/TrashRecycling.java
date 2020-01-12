package chengxi0.initializeandclearnup;

/**
 * @author 承夕
 * @date 2020/1/12 0012 - 20:28
 * @contact:https://github.com/chengxi0
 */
public class TrashRecycling {
    @Override
    protected void finalize(){
        System.out.println("嘻嘻");
    }
    public static void main(String[] args) {
        new TrashRecycling();
        //强制调用垃圾回收器和finalize方法
        System.gc();
    }
}
/*
Java中垃圾回收器和终结条件的理解
垃圾回收器：只知道释放那些由new关键字分配在堆空间的内存。
堆内存：Java的所有new出来的对象都存放在堆内存中，但是C++
中的对象是可以在堆栈中创建的，也可以通过堆内存创建，前者是
通过右花括号进行销毁，后者是通过delete方法，调用析构函数进行释放
对应的堆内存。
调用机制：每次调用垃圾回收器，会先调用一个finalize方法，这个方法
的存在是为了希望释放存储空间以外的清理动作，还得明确调用某个恰当的
Java方法。（不是new出来的内存，而是通过某种创建对象方式以外的方式为
对象分配了存储空间。）
终结条件：所有创建出来的对象在被垃圾回收前的一种状态，一般我们用finalize
方法来验证终结条件。
注意点： a 无论是垃圾回收还是终结条件的finalize方法，都不保证一定会发生，如果Java
虚拟机并未面临内存耗尽的情况，它不会浪费时间去执行垃圾回收以回复内存。因此可以调用
System.gc()方法，确保（强制）进行终结操作。finalize方法就会执行。
*/
