package chengxi0.collections;

import java.util.HashMap;

/**
 * 练习：
 * 计算一个字符串中字符的个数
 * 如"aaabbbbcca"
 * @author 承夕
 * @date 2019/12/22 0022 - 20:10
 * @contact:https://github.com/chengxi0
 */
public class Mappretice {
    /*
    分析一波（创建一个键是Character 值是Integer的Map集合
    a 首先把"aaabbbbcca"字符串的字符迭代逐个添加到map集合中
    b 在添加过程中如果出现键重复了，就把值加一
     */
    public static void main(String[] args) {
        String str = "aaabbbbcca" ;
        //创建一个Character为键Integer为值的Map集合map
        HashMap<Character, Integer> map = new HashMap<>();
        //首先把"aaabbbbcca"字符串的字符迭代逐个添加到map集合中
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                //在添加过程中如果出现键重复了，就把值加一
                map.put(str.charAt(i),  map.get(str.charAt(i) )    +  1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);
    }
}



