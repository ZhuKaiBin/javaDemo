package CodeSources;

public class StringDemo {
    public static void main(String[] args) {

        String str = "1,b,c,4";
        var strArray = str.split(",");
        var strs= String.join("-",strArray);
        System.out.println("strs = " + strs);


        P p=new P();
        p.name="pppp";
//        p.setName("John");
        System.out.println("Name: " + p.getName());
    }
}

 class  P
{
  public  String name;
    // Getter 方法
    public String getName() {
        return name;
    }

    // Setter 方法
    public void setName(String name) {
        this.name = name;
    }

}
