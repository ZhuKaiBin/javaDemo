package ThreadDemo;

public class MyThread extends  Thread{
    @Override
    public  void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println(getName()+"子线程——"+i);
        }
    }
}
