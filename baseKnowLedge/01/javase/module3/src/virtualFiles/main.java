package virtualFiles;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Pig pig = new Pig("实现的虚方法", "1111");
        var link = pig.RetLink();
        var address = pig.getAddress();
        var phone = pig.getPhone();

        List<Pig> pigList = new ArrayList<>();
        // 添加 Pig 对象到集合中
        Pig pig1 = new Pig("Pigsty Lane", "123-456-7890");
        Pig pig2 = new Pig("Farm Road", "987-654-3210");
        pigList.add(pig1);
        pigList.add(pig2);

        // 打印集合内容
        System.out.println("Pig List:");
        for (Pig pig11 : pigList) {
            System.out.println("Address: " + pig11.getAddress() + ", Phone: " + pig11.getPhone());
        }


        // 使用 Arrays.asList 初始化 List<Pig> 集合
        List<Pig> pigList2 = Arrays.asList(
                new Pig("Pigsty Lane", "123-456-7890"),
                new Pig("Farm Road", "987-654-3210")
        );
        for (var pp : pigList2) {
            System.out.println("Address: " + pig.getAddress() + ", Phone: " + pig.getPhone());
        }





    }
}

