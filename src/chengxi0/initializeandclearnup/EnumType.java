package chengxi0.initializeandclearnup;
/**
 * 枚举类型
 * @author 承夕
 * @date 2020/1/13 0013 - 20:11
 * @contact:https://github.com/chengxi0
 */
public enum EnumType {
    /**
     * 星期一
     */
    WON ,
    /**
     * 星期二
     */
    TUE,
    /**
     * 星期三
     */
    WED,
    /**
     * 星期四
     */
    THU ,
    /**
     * 星期五
     */
    FRI ,
    /**
     * 星期六
     */
    STA,
    /**
     * 星期日
     */
    SUN
}
/*
枚举类型
有几个比较重要的方法和用法：
1 enum 类型的声明格式,格式如上面，注意名字与文件名一致
2 enum 已经重写了toString()方法
3 enum的枚举类型的所有常量可以通过调用该类型的隐式public static T[] values()方法来获得。
返回的是enum类型的数组 如上就是 EnumType[] 因此这个可以利用增强for 循环遍历枚举类型的顺序位置
4 enum的ordinal（）方法用来表示某个特定的enum常量的声明顺序(从0开始计数)
5 enum类型与switch配合使用简直绝配。
 */