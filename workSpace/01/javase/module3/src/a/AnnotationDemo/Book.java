package a.AnnotationDemo;

public @interface Book {
    String bookName();
    String[] suthor();

    int count() default  10;
}
