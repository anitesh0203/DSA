package basicsJava;

/**
 * We create an anonymouse inner class by providing the method in the object declaration
 */



class A {
    public void display() {
        System.out.println("I can display");
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        A a = new A(){
            public void display () {
                System.out.println("I can dance too");
            }
        };

        a.display();
    }
}
