package Workshop_Day3.entites;

public class Car {

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    private int id;
    private String brand;
    private String color;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand=" + brand + '\n' +
                "color= " + color +'\n';
    }
}
