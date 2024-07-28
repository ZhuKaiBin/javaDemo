package FileDemo;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        //file01();
        //file02();
        file03();
        
        file04();
    }

    private static void file04() {
    }

    private  static  void file01()
    {
        String path1= File.pathSeparator;
        System.out.println(path1);

        System.out.println(File.separator);
    }

    private  static  void file02()
    {
        var file=new File("1.txt");
        System.out.println(file.getAbsoluteFile());

    }

    private  static  void file03()
    {
        var file=new File("1.txt");
        System.out.println(file.getPath());

    }

}
