package src.sss;

import java.io.FileNotFoundException;

public class ExceptionDdemo {

    public static void main(String[] args) throws Exception {

        update();
       add();


    }


    public  static  void add() throws Exception {
//        throw  new FileNotFoundException("999");

        System.out.println(" =+++++====+++==== " );

    }

    private  static  void update()
    {
        try
        {
            throw  new FileNotFoundException("999");
        }
        catch (Exception exs)
        {
            System.out.println("exs.getMessage() = " + exs.getMessage());
            for (StackTraceElement stackTraceElement : exs.getStackTrace()) {
                System.out.println("stackTraceElement.getClassLoaderName() = " + stackTraceElement.getClassLoaderName());
                System.out.println("stackTraceElement.getClassName() = " + stackTraceElement.getClassName());
                System.out.println("stackTraceElement.toString() = " + stackTraceElement.toString());
            }
        }

    }

}
