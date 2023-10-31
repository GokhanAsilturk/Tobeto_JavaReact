package Workshop_Day3.business;


import Workshop_Day3.entites.Car;

public interface ICarManager {

    void add(Car car);
    void get(Car car);
    void updateName(Car car, String newName);
    void delete(Car car);


}
