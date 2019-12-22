package chengxi0.collections;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap集合是有序的集合而hashMap集合是无序的集合
 * 继承关系LinkedHashMap集合继承HashMap集合,同时也保证Key值不重复
 * @author 承夕
 * @date 2019/12/22 0022 - 19:52
 * @contact:https://github.com/chengxi0
 */
public class MapLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("小米", 23);
        map.put("小红", 24);
        map.put("小话", 25);
        map.put("小果", 26);

        map.remove("小米");

        System.out.println(map);

        //储存和取出的顺序是有的

    }
}



