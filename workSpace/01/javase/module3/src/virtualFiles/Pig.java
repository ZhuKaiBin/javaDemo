package virtualFiles;

public class Pig  extends  Admin{
    private String address;
    private String phone;

    public Pig(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String RetLink()
    {
        return String.format("%s - %s,%s", address, phone,"666666");
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhone() {
        return phone;
    }
}
