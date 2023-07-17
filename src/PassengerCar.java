import java.util.HashMap;
import java.util.Map;

public class PassengerCar extends Car {
    private int passCount;
    private Map<String, Integer> repairBook;

    public PassengerCar(String brand, int power, int yearOfCreate, int passCount) {
        super(brand, power, yearOfCreate);
        this.passCount = passCount;
        this.repairBook = new HashMap<>();
    }

    public void PrintRepairBook() {
        for (Map.Entry<String, Integer> entry : repairBook.entrySet()) {
            System.out.println(entry);
        }
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Количество пассажиров: " +passCount);
        System.out.println();
        PrintRepairBook();
    }
}
