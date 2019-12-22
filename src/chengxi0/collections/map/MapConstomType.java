package chengxi0.collections.map;

import chengxi0.collections.map.Person;

import java.util.HashMap;
import java.util.Map;

/**
 *利用自定义类型作为键的时候必须保证元素的唯一，
 * 因此自定义类必须重写hashCode方法和equals方法
 * @author 承夕
 * @date 2019/12/22 0022 - 18:54
 * @contact:https://github.com/chengxi0
 */
public class MapConstomType {
    public static void main(String[] args) {
        //创建一个以自定义类型作为键的map集合
        Map<Person, String> map = new HashMap<>();

        //往集合里面添加元素
        map.put(new Person("女王",23),"英国");
        map.put(new Person("秦皇",2003),"中国");
        map.put(new Person("普京",53),"俄罗斯");
        map.put(new Person("女王",23),"英国");

        //遍历map集合里面的元素看看是否真的能够保证键的唯一
        for (Person p : map.keySet()) {
            System.out.println(p + "-->" + map.get(p));
        }

        System.out.println("--------------------");
        //利用Map.Entry<K,V>进行遍历
        for(Map.Entry<Person,String> en : map.entrySet())
        {
            System.out.println(en.getKey() + "--> " + en.getValue());
        }

        //当掩盖hashCode方法和equals方法的时候，发现无法保证键唯一

    }
}



