public class ConstructorBasics {
    String name;
    int age;

    ConstructorBasics(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorBasics s1 = new ConstructorBasics("Nikhil", 20);
        s1.display();
    }
}