package Workshop_Day3;

import Workshop_Day3.business.CarManager;
import Workshop_Day3.dataAccess.HibernateDao;
import Workshop_Day3.entites.Car;

public class Main {

    public static void main(String[] args) {


        CarManager carManager = new CarManager(new HibernateDao());

        Car car1 = new Car("volvo", "blue");

        carManager.add(car1);
        carManager.get(car1);
        carManager.updateName(car1, "mercedes");
        carManager.delete(car1);
    }
}
