public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Luntung",20, "Pria", "Jl, Manchester", "08909090");
        Person person2 = new Person("Rodrigo", 30, "Pria", "Jl. Walter", "08123123");
        System.out.println("Data ke 1 ");
        person1.displayInfo();
        System.out.println("\n");
        System.out.println("Data ke 2 ");
        person2.displayInfo();
        //mengubah nilai person1 dgn setter
        person1.setName("Freya");
        person1.setAge(20);
        person1.setGender("Perempuan");
        person1.setAddress("Jl. Malioboro");
        person1.setNotelp("0877777777");
        //mengubah nilai person2 dgn setter
        person2.setName("Layla");
        person2.setAge(18);
        person2.setGender("Perempuan");
        person2.setAddress("Jl. Afung");
        person2.setNotelp("081212121");
        System.out.println("\n");
        //menampilkan data terbaru
        System.out.println("Updated Information");
        System.out.println("Data ke 1");
        person1.displayInfo();
        System.out.println("\n");
        System.out.println("Data ke 2");
        person2.displayInfo();
    }
}
