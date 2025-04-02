package completable.combining;

import completable.combining.helper.Employee;
import completable.combining.helper.TaxCalculate;

import java.util.concurrent.CompletableFuture;

public class ThenCompose {
    public static void main(String[] args) {
        /**
         * If your callback function returns a CompletableFuture,
         * and you want a flattened result from the CompletableFuture
         * chain (which in most cases you would), then use thenCompose().
         */
        CompletableFuture<Integer> future = getEmployeeFuture()
                .thenCompose(user -> getTax(user));
    }

    // imagine you are calling employee srevice
    static CompletableFuture<Employee>  getEmployeeFuture() {
        Employee employee = new Employee();
        CompletableFuture<Employee> future =
                CompletableFuture.supplyAsync(()->{
                    return employee.getEmployee();
                });
        return future;
    }

    // this calculates the tax of the employee
    static CompletableFuture<Integer> getTax(Employee e) {
        TaxCalculate taxCalculate = new TaxCalculate();
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->{
           return taxCalculate.getTax(e);
        });
    return future;
    }
}
