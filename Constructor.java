public class Constructor {
    int a;
    float b;
    String c;

    Constructor() {
        System.out.println("Default Constructor");
    }

    Constructor(int a) {
        this.a = a;
    }

    Constructor(int a, float b) {
        this.a = a;
        this.b = b;
    }

    Constructor(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();

        Constructor obj2 = new Constructor(10);
        System.out.println("Inside object2");
        System.out.println("a: " + obj2.a);
        System.out.println("b: " + obj2.b);
        System.out.println("c: " + obj2.c);

        Constructor obj3 = new Constructor(20, 5.5f);
        System.out.println("Inside object3");
        System.out.println("a: " + obj3.a);
        System.out.println("b: " + obj3.b);
        System.out.println("c: " + obj3.c);

        Constructor obj4 = new Constructor(30, 10.5f, "Hello");
        System.out.println("Inside object4");
        System.out.println("a: " + obj4.a);
        System.out.println("b: " + obj4.b);
        System.out.println("c: " + obj4.c);
    }
}
