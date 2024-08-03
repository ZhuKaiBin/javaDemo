package CodeSources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

       //region  动态初始化
//        //动态初始化
        int[] array1=new int[3];
        array1[0]=0;
        array1[1]=1;
        array1[2]=2;

        var s= Arrays.stream(array1).max().getAsInt();
        System.out.println("s = " + s);

//
//        for (var i :array1)
//        {
//            System.out.println("i="+i);
//        }
//
//        String[] arr2= {"1","222"};
//
//        String[] arr3= new String[]{"value1", "value2", "value3"};
//        var arr3Clone= arr3.clone();
//        var s= arr3Clone.length;
//        var ll= Arrays.stream(arr3Clone).count();
//        System.out.println("s = " + s);
//        System.out.println("ll = " + ll);
//
//        var strIndex2= arr3Clone[2];
//        System.out.println("strIndex2 = " + strIndex2);


//endregion




        //region 数组扩容



        //endregion











    }
}
