package a.AnnotationDemo;

public class demoTest {
    public static void main(String[] args) {
        Class BOOKsHLES= BookShelf.class;
       var dd= BOOKsHLES.isAnnotationPresent(Book.class);
        System.out.println(dd);
    }
}
