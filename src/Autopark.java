import java.util.ArrayList;

public class Autopark {
    String autoParkName;
    ArrayList<Car> arrayCarList;

    public Autopark(String autoParkName) {
        this.autoParkName = autoParkName;
        this.arrayCarList = new ArrayList<>();
    }

    public ArrayList<Car> getArrayCarList() {
        return arrayCarList;
    }

    public void PrintAutopark() {
        for (Car item : arrayCarList) {
            item.Print();
        }
    }
}
