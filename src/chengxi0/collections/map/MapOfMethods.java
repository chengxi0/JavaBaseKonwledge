package chengxi0.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * A java.util.HashMap<k,V>集合 实现了 Map<K,v>接口
 * HashMap集合的特点：
 * 1 HashMap结合底层是哈希表，查询速度特别快
 *          JDK1.8之前数组 + 单向链表
 *          JDK1.8之后 数组 + 单向链表/红黑树（链表长度超过8）提高查询速度
 * 2 HashMap集合是一个无序集合储存和取出元素的顺序可能不一致
 *
 * B java.util.LinkedHashMap<K ,V>集合 extends HashMap<K v>
 *     特点：
 *     a LinkedHashMap结合底层是哈希表 + 链表
 *     b LinkedHashMap集合是一个有序集合，储存和取出元素的顺序是一致的
 * C map集合的常用方法
 *
 *
 *
 * @author 承夕
 * @date 2019/12/22 0022 - 11:09
 * @contact:https://github.com/chengxi0
 */
public class MapOfMethods {
    public static void main(String[] args) {
        show04();
    }

    /**
     * boolean containsKey(Object key)  包含键
     * boolean containsValue(Object value) 包含值
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("周福成", 20);
        map.put("海文", 21);
        map.put("嘻嘻", 23);


        System.out.println(map.containsKey("周福成"));
        System.out.println(map.containsValue(20));
        System.out.println(map.containsValue(2));
        System.out.println(map.containsKey("sfs"));

    }

    /**
     * V get(Object key)
     * 返回到指定键所映射的值(key)存在，或 null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("周福成", 20);
        map.put("海文", 21);
        map.put("嘻嘻", 23);

        Integer i1 = map.get("周福成");
        Integer i2 = map.get("海文");
        Integer i3 = map.get("sfs");            //不存在因此返回null


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }


    /**
     * V remove(Object key)
     * 如果存在（从可选的操作），从该中删除一个键的映射。
     *  返回值：
     *  如果key存在那么返回删去的value
     *  如果不存在那么就返回null
     */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("周福成", 20);
        map.put("周成", 22);

        Integer i1 = map.remove("周福成");
        Integer i2 = map.remove("fsf");

        System.out.println(i1);
        System.out.println(i2);

        System.out.println(map);
    }

    /**
     * public V put(K key , V value) :
     * 返回值 V
     *       储存的时候，key值不可以重复，返回V是null
     *       key重复那么就会使用新的value去替代旧的value，返回旧的value值
     */
    private static void show01() {
        Map<String, Integer> map = new HashMap<>();
        Integer i1 = map.put("周福成", 20);
        Integer i2 =map.put("周福成", 22);
        Integer i3 =map.put("周2成", 24);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        
        System.out.println(map);





    }
}



