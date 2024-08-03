package pojo;

public class Employee {

    private Integer empId;

    private  String name;

    private  Integer Age;



    public void setAge(Integer age) {
        Age = age;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
