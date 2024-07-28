package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {

        Map<String, String> str = new HashMap<String, String>();
        str.put("a", "1");
        str.put("b", "2");

        var keysSet = str.keySet();
        keysSet.forEach(x -> System.out.println("lamdba的输出方式" + str.get(x)));

        for (String str2 : keysSet) {
            System.out.println("正常for循环输出方式" + str.get(str2));
        }

        var enties = str.entrySet();
        str.forEach((k, v) -> {
            System.out.println(k + "---" + v);
        });
    }
}
