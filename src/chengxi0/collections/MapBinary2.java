package chengxi0.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历的第二种方式
 * Map集合里面有一个内部接口static interface  Map.Entry<K,V>  相当于结婚证
 * （注意这是类型是静态接口，利用类名点调用）但是entrySet方法不是静态的利用对象调用
 * Map.Entry<K,V>里面有两个比较重要的方法
 * K getKey()
 * 返回与此条目相对应的键。
 * V getValue()
 * 返回与此条目相对应的值
 *
 * a 通过Set<Map.Entry<K,V>> entrySet()方法 返回此Map中包含的映射的Set视图
 * b 遍历set集合即可（迭代器或者增强for循环）
 * c 利用Map.Entry<K,V>里面的getKey和getvalue方法
 *
 * @author 承夕
 * @date 2019/12/22 0022 - 18:35
 * @contact:https://github.com/chengxi0
 */
public class MapBinary2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("小米", 23);
        map.put("小工", 24);
        map.put("小横", 25);
        map.put("小哎", 25);
        map.put("小的", 25);

        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        Iterator<Map.Entry<String, Integer>> its = entrys.iterator();
        while (its.hasNext()) {
            Map.Entry<String ,Integer> en = its.next();
            System.out.println(en.getKey() + "=" + en.getValue());
        }

        System.out.println("--------------------");
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + "=" + en.getValue());
        }
    }
}
