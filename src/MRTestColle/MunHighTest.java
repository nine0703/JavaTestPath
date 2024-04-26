package MRTestColle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MunHighTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("腾讯", "马化腾");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"::"+map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + "::" + v));

        Map<String,Map<String, Integer>> car = new HashMap<>();
        car.put("李天猫",new HashMap<>());
        car.get("李天猫").put("java", 20);

        Set<String> strings = car.keySet();
        for (String string : strings) {
            Map<String, Integer> stringIntegerMap = car.get(string);
            Set<String> strings1 = stringIntegerMap.keySet();
            for (String s : strings1) {
                stringIntegerMap.get(s);
            }
        }

        car.forEach((k,m)->{
            System.out.println(k);
            m.forEach((e, v) -> System.out.println("\t"+e + "::" + v));
        });
        // 测试

    }   // Method main end.

}   // Class end.
