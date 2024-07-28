package src.sss;

public class zi extends  fu {

    zi()
    {
        //调用父类中的方法
        super.Method();
        System.out.println("子类构造true = " + true);
    }


    public zi(int s) {
        this();
//           super(s);
    }


    public  void MethodZi()
    {



        super.Method();//调用父类的Method方法
        System.out.println("true = " + true);
    }

    @Override
    public void Method()
    {
        System.out.println("子类true = " + true);
    }
}
