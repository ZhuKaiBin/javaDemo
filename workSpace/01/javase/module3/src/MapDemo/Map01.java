package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {

        Map<String,String> str=new HashMap<String,String>();
        str.put("a","1");

        var valueStr= str.get("a");
        System.out.println(valueStr);
    }
}
