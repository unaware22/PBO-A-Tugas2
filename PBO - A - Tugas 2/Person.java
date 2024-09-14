public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String Notelp;

    public Person (String name,int age, String gender, String address, String Notelp){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.Notelp = Notelp;
    }
    public void displayInfo() {
        System.out.println("Name        : " + this.name);
        System.out.println("Age         : " + this.age);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Adress      : " + this.address);
        System.out.println("No Telephone: " + this.Notelp);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setNotelp (String Notelp) {
        this.Notelp = Notelp;
    }
    public String getNotelp() {
        return this.Notelp;
    }
}
