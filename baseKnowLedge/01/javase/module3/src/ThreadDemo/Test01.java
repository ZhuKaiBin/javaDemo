package ThreadDemo;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {


        MyThread thread2 = new MyThread();
        thread2.setName("行者");
        thread2.start();
        thread2.join();

        MyThread thread = new MyThread();
        thread.setName("武松");
        thread.start();

        MyThread thread3 = new MyThread();
        thread3.setName("行者3");
        thread3.start();


        System.out.println("xx" + thread.getName());


//        thread.run();//肯定是先走完子线程，才会继续往下走，但是这不代表开启线程；类似同步
        //只要调用start(),才算开启线程

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程——" + i);
        }
    }
}
