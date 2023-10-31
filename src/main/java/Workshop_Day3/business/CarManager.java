package Workshop_Day3.business;

import Workshop_Day3.dataAccess.CarDao;
import Workshop_Day3.entites.Car;

public class CarManager implements ICarManager {
    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public void add(Car car) {
        System.out.println(carDao.add(car.getId()) + car.toString());

    }

    @Override
    public void get(Car car) {
        System.out.println(carDao.get(car.getBrand()) + car.toString());
    }

    @Override
    public void updateName(Car car, String newName) {
        String oldName = car.getBrand();
        car.setBrand(newName);
        System.out.println(oldName + " markalı aracın yeni markası " + car.getBrand() + " olarak " +
                carDao.update(car.getId()));
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getBrand() + " aracı " + carDao.delete(car.getId()));
    }

}
