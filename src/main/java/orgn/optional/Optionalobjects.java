package orgn.optional;

import orgn.optional.model.Car;
import orgn.optional.model.Comapny;
import orgn.optional.model.CrashReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionalobjects {
    public static void main(String[] args) {
        Comapny p1 = new Comapny("adani",123,"gujrat");
        Comapny p2 = new Comapny("reliance",124,"mumbai");

        CrashReport cr1 = new CrashReport("pass",8,p1);
        CrashReport cr2 = new CrashReport("fail",1,p2);
        CrashReport cr3 = new CrashReport("fail",1,null);


        Car c1 = new Car(101,"sedan",cr1);
        Car c2 = new Car(102,"suv",cr2);
        Car c3 = new Car(103,"truck",cr3);


        List<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(null);

        // traditional - to print the crashreport result of all cars

        for (Car car:list) {
            if(car != null && car.getCrashReport() !=null) {
                System.out.println(car.getCrashReport().getRating());
            }
        }

        // using the optional and stream
        list.forEach(carItem->{
            Optional.ofNullable(carItem)
                    .map(Car::getCrashReport)
                    .ifPresent(report-> System.out.println(report.getRating()));
        });
        //complex mapping
        List<String> l = new ArrayList<>();
        list.forEach(x->{
            Optional.ofNullable(x)
                    .map(Car::getCrashReport)
                    .map(CrashReport::getComapny)
                    .ifPresent(company->{
                        l.add(company.getName());
                    });
        });
        System.out.println(l);
    }
}
