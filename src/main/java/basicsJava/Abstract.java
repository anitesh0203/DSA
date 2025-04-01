package basicsJava;

/***
 * WHY - Lets say we have a class which has a method A, the class as of now does not have
 * logic for implementation of A so it will declare the method as abstarct. The class also
 * must be declared as abstract. Only a concrete class which extends and defines base abstract class
 * and its method can be instantiated.
 */


abstract  class Mammal {
    public void walk() {
        System.out.println("Yes we can walk !");
    }
    abstract public void writePoem();
}

class Human extends Mammal{

    public void writePoem() {
        System.out.println("I can sing poems !");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Mammal mammal = new Human();
        mammal.writePoem();
    }
}
