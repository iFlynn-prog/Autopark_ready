public class Car {
    private String brand;
    private int power;
    private int yearOfCreate;

    public Car(String brand, int power, int yearOfCreate) {
        this.brand = brand;
        this.power = power;
        this.yearOfCreate = yearOfCreate;
    }
    public void print() {
        System.out.println("Марка: " + brand +
                "\nМощность: " + power + "\n" + "Год производства: " + yearOfCreate);
        System.out.println();
    }
}
