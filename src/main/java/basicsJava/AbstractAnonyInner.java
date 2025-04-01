package basicsJava;


/**
 * We create an abstract class BUT instaed of having a concrete class implment the missing method impl,
 * we use anonymous inner class.
 */

abstract class Aa {
    abstract  public void display();
}
public class AbstractAnonyInner {

    public static void main(String[] args) {
        Aa a = new Aa(){
            public void display() {
                System.out.println("This is the inner class representing the impl");
            }
        };
        a.display();
    }


}
