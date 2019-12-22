package chengxi0.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历Map集合的第一种方式：
 * a 利用map集合的keySet方法获取到key的set集合
 * b 对set集合进行遍历获取到每一个key值（可以使用增强for循环获取迭代器）
 * c 利用get（Object key）方法获取每个key对应的value
 *
 *
 * @author 承夕
 * @date 2019/12/22 0022 - 18:17
 * @contact:https://github.com/chengxi0
 */
public class MapBinary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("小米", 23);
        map.put("小工", 24);
        map.put("小横", 25);
        map.put("小哎", 25);
        map.put("小的", 25);


        //利用map集合的keySet方法获取到key的set集合
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s + "=" + map.get(s));
        }
        /*
        小横=25
        小哎=25
        小工=24
        小的=25
        小米=23 说明了储存和遍历和取出的顺序不一定
         */
        
        System.out.println("----------------------");
        //利用增强for循环遍历
        for (String s : map.keySet()) {
            System.out.println(s + "=" + map.get(s));
        }


    }
}



