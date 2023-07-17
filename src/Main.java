public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 100, 2010);
        PassengerCar passengerCar = new PassengerCar("Volvo", 100, 2021, 4);
        Truck truck = new Truck("Mercedes", 1200, 2025);


        Autopark autopark = new Autopark("MyAutopark");

        autopark.getArrayCarList().add(car);
        autopark.getArrayCarList().add(passengerCar);
        autopark.getArrayCarList().add(truck);


        //truck.setMaxVelocity(100);
        // autopark.PrintAutopark();
        // autopark.getArrayCarList();
        //truck.setFirstNameDriver("Alex");
        // truck.setLastNameDriver("Ivanov");

        //truck.RenameDriver("Иван", "Сидоров");
        //  truck.RenameDriver("Петр", "Иванов");

        //truck.AddGoods("Песок", 10);
        // truck.AddGoods("Хрень", 20);
        //truck.AddGoods("Мука", 100);
        // truck.Print();
        //truck.DelGoods("Мука", 100);
        //  truck.PrintCurrentGoods();


        passengerCar.AddRepair("Замена задницы", 2020);
        passengerCar.AddRepair("Замена машины", 2023);
        passengerCar.AddRepair("хуета машины", 2022);




        passengerCar.PrintRepairBook();




    }
}