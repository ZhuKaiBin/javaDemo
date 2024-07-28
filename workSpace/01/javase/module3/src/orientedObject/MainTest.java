package orientedObject;

public class MainTest {

    public static void main(String[] args) {
        Person person=new Person();
        person.Age=18;
        person.Name="TOM";

        //匿名对象
        new Person().drink();

        Person.staticMethod();
    }
}
