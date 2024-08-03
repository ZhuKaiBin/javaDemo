package utilList;

import java.util.ArrayList;
import java.util.List;

public class utilList {
    public static void main(String[] args) {
        // 创建一个 List<String> 集合
        List<String> stringList = new ArrayList<>();

        // 添加元素到集合中
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // 打印集合内容
        System.out.println("List elements:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
