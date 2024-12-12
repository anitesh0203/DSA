package orgn.lambda;

public interface Modifier {
     int multiplier(int n);
     default void greet(){
         System.out.println("Welcome to the club");
     }
}
