package virtualFiles;

public class Admin {
    // 虚方法（在Java中所有非静态、非final方法默认都是虚方法）
    public String getAddress() {
        return "Default Address";
    }

    public String getPhone() {
        return "Default Phone";
    }
}
