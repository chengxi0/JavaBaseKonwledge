package chengxi0.collections.map;

import java.util.Hashtable;

/**
 * Map的另外一个实现类Hashtable在JDK1.0版本就和Vector存在了
 * 但是在JDK1.2版本后被更加高级的集合取代了，但是其一个子类Properties类依然
 * 还在历史的舞台活跃着。其是唯一个与IO流相结合的集合。
 * 与hahMap不一样的地方：
 * a 它不能储存null包括键和值都不可以但是HashMap可以储存空值空键
 * b 第二就是同步的线程安全的
 * @author 承夕
 * @date 2019/12/22 0022 - 20:02
 * @contact:https://github.com/chengxi0
 */
public class MapHashtable {

    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
       // table.put(null, 2);     //NullPointerException会出现空指针异常（键和值都不可以使用null）
    }
}



