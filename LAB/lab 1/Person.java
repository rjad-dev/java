public class Person {
    String name;
    String gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Male", 18);
        Person p2 = new Person("Jenny", "Female", 21);

        p1.displayDetails();
        p2.displayDetails();
    }
}
