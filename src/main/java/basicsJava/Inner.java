package basicsJava;

/**
 * Use inner class when the enclosing class would use the inner class as just data member.
 */

class Employee{
    public void salary() {
        System.out.println("returns the salary of the employee");
    }
    class Office {
        public void size() {
            System.out.println("Office is 1000 sq ft in size");
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee.Office office = employee.new Office();
        office.size();
    }
}
