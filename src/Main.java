public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 100, 2010);
        PassengerCar passengerCar = new PassengerCar("Volvo", 1000, 2021, 4);
        Truck truck = new Truck("Mercedes", 1200, 2025);



        Autopark autopark = new Autopark("MyAutopark");

        autopark.getArrayCarList().add(car);
        autopark.getArrayCarList().add(passengerCar);
        autopark.getArrayCarList().add(truck);


        autopark.PrintAutopark();
        autopark.getArrayCarList();

        truck.setMaxVelocity(-100);
        truck.RenameDriver("Иван", "Сидоров");
        truck.RenameDriver("Петр", "Иванов");

        truck.AddGoods("Песок", 10);
        truck.AddGoods("Хрень", 20);
        truck.AddGoods("Мука", 100);

        truck.DelGoods("Мука", 100);
      //  truck.PrintCurrentGoods();

        truck.print();
    }
}